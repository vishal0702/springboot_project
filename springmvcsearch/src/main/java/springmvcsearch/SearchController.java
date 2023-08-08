package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int userId) {
		
		System.out.println(userId);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		String s1=null;
		System.out.println(s1.charAt(0));
		System.out.println("Going to home view...");
		return "home";
	}
	
	/*
	 * @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value=Exception.class) public String exceptionHandler(Model
	 * m){ m.addAttribute("msg","Exeception has occured"); return "exception"; }
	 */
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

}
