package practice.webapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import practice.webapp.DAO.WordDAO;
import practice.webapp.Entity.Word;
import practice.webapp.Service.WordService;

import javax.swing.*;
import java.util.List;

@Controller
public class WordController {

    @Autowired
    WordService wordService;

    @Autowired
    WordDAO wordDAO;

    @RequestMapping(value = "/addWords", method = RequestMethod.POST)
    public String addWord(ModelMap model, Word word){

        String temp = wordService.insertWordInDB(word);

        if(temp.isEmpty()){
            model.addAttribute("successMessage", word.getWord() + " this word has been stored.");
            return "home";
        }
        model.addAttribute("errorMessage", temp);
        return "WordsForm";
    }

    @RequestMapping(value = "/keyword/{searchedKeyword}")
    public String getInfoAboutSearchedKeyword(ModelMap model, @PathVariable(value = "searchedKeyword") String searchedKeyword) {
        System.out.print(searchedKeyword);
        Word wordTemp = wordService.findByWord(searchedKeyword);
        model.addAttribute("Word", wordTemp.getWord());
        model.addAttribute("Definition", wordTemp.getDefinition());
        model.addAttribute("Example", wordTemp.getExample());
        if(wordTemp.getSecondexample() != null){
            model.addAttribute("SecondExample", wordTemp.getSecondexample());
        }
        return "wordDetail";
    }

}
