package practice.webapp.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.Entity;

@Controller
public class SearchController {

    public class SearchWord {
        public String keyword;

    }


   @RequestMapping(value = "/search", method = RequestMethod.POST)
    public void search(@ModelAttribute SearchWord searchWord){
        System.out.print(searchWord.keyword);
    }

    
}
