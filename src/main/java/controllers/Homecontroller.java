package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@Controller
public class Homecontroller {
    
    
	@GetMapping("test")
	public ModelAndView home(){
       ModelAndView model = new ModelAndView("home");
        return model;
    }
	
	

}
