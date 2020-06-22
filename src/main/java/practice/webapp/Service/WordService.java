package practice.webapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.webapp.DAO.WordDAO;
import practice.webapp.Entity.Word;

@Service
public class WordService {

    @Autowired
    WordDAO wordDAO;

    public String insertWordInDB(Word word) {

        if(word.getWord().isEmpty() || word.getDefinition().isEmpty() || word.getExample().isEmpty()){
            return "fill all fields";
        }
        wordDAO.save(word);
        return "word is saved";
    }
}