package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		String str=null;
		System.out.println(str.charAt(0));
		return "fileForm";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println("File Upload Handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		byte[] data = file.getBytes();

		// We have to save this file on server
		String realPath = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		System.out.println(realPath);

		try {
			FileOutputStream fos = new FileOutputStream(realPath);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
			model.addAttribute("msg", "Uploaded Successfully");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error in uploading image");
			model.addAttribute("msg", "Uploading Error");
		}

		return "filesuccess";
	}
}
