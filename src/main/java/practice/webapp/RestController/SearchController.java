package practice.webapp.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.webapp.Entity.SearchWord;
import practice.webapp.Service.SearchService;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

   @RequestMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<String> search(@RequestBody SearchWord searchWord){
        System.out.print(searchWord.keyword + "\n");
        return  searchService.listAllMatchingWords(searchWord.getKeyword());
    }


}
