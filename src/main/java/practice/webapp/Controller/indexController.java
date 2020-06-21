package practice.webapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import practice.webapp.Entity.Word;
import practice.webapp.Service.WordService;

@Controller
public class indexController {

    @Autowired
    WordService wordService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/index", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String addWord(Word word){
        return wordService.insertWordInDB(word);
    }
}
