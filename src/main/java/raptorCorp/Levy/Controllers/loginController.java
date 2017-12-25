package raptorCorp.Levy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class loginController {

	@RequestMapping(method = RequestMethod.GET)
    public String LoginControlPagePathGet(Model model)
    {
		return "index";
    
    }
	
}
