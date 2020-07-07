package practice.webapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/WordsForm", method = RequestMethod.POST)
    public String addWordsForm(){
        return "WordsForm";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(){
        return "form";
    }
    
}
