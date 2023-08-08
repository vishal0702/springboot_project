package springmvcsearch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {

	@RequestMapping("/complexForm")
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("studentEntity") StudentEntity studentEntity, BindingResult result) {
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		
		System.out.println(studentEntity);
		System.out.println(studentEntity.getAddress());
		return "success";
	}
}
