package practice.webapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import practice.webapp.DAO.WordDAO;
import practice.webapp.Entity.Word;

import java.util.List;

@Service
public class WordService {

    @Autowired
    WordDAO wordDAO;

    public String insertWordInDB(Word word) {
        String error = "";
        if(word.getWord().isEmpty() || word.getDefinition().isEmpty() || word.getExample().isEmpty()){
            error = "fill all fields";
        }
        if (word.getExample().equals(word.getSecondexample())) {
            error = "both examples can not be same";
        }
        if(findByWord(word.getWord()) != null){
            error = "word is already stored in db";
        }
        if(!error.isEmpty()){
            return error;
        }
        wordDAO.save(word);
        return error;
    }

    public Word findByWord(String word) {
        return wordDAO.findByWord(word);
    }


    public List<String> listAllMatchingWords(String searchWord) {
        return wordDAO.findAllByMatchingKeyword(searchWord);
    }


   /* public Boolean validateWord(Word word){
        if (word.getExample().equals(word.getSecondexample())) {
            return false;
        }
        if(word.getWord().equals(wordDAO.findAll())){
            return false;
        }
        return true;
    }
*/


}