package practice.webapp.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import practice.webapp.Entity.SearchWord;
import practice.webapp.Service.WordService;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    WordService wordService;



   @RequestMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<String> search(@RequestBody SearchWord searchWord){
        //System.out.print(searchWord.keyword + "\n");
        return  wordService.listAllMatchingWords(searchWord.getKeyword());
    }


}
