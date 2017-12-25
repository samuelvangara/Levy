package raptorCorp.Levy.Controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import raptorCorp.Levy.Pojos.userInformationPojo;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {

	ModelAndView modelView;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView WelcomeControlPagePathGet(ModelAndView modelView) {
		return modelView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView WelcomeControlPagePathPost(HttpServletRequest request) {

		userInformationPojo uIP = new userInformationPojo();
		uIP.setUserName(request.getParameter("username"));
		uIP.setPassword(request.getParameter("password"));
		if (uIP.getUserName().length() == 0) {
			modelView = new ModelAndView("Login");
			modelView.addObject("FailureLoginMessage", "Please enter the correct username and password.");
		} else {
			modelView = new ModelAndView("Welcome");
			request.setAttribute("Username", uIP.getUserName());
			request.setAttribute("Password", uIP.getPassword());
		}
		return modelView;
	}
}