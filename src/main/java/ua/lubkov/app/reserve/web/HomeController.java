package ua.lubkov.app.reserve.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String home() {  
		System.out.println("index");
		
		return "index";
    }
	
	@RequestMapping("/")
    public String home2() {
	    return "redirect:/index";
    } 
	
	@RequestMapping(value = "/accessDenied")
    public String accessDenied() {

          return "error403";
    }
	
	@RequestMapping("/admin")
	public String admin() {  
		return "admin";
    }
}
