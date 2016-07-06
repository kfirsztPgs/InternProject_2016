package pgs.soft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringWEBController {
	
	@Autowired
	User user;
	@RequestMapping("/welcome")
	public ModelAndView ShowUser(){
		String message = "Witaj! " + user;
		return new ModelAndView("welcome", "message", message);
	}
}
