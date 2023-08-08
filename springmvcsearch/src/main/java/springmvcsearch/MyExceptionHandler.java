package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNullPointer(Model m){
		m.addAttribute("msg","Null Pointer Exeception has occured");
		return "exception";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m){
		m.addAttribute("msg","Number Format Exeception has occured");
		return "exception";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandler(Model m){
		m.addAttribute("msg","Exeception has occured");
		return "exception";
	}

}
