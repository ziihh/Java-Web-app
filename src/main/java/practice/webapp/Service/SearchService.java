package practice.webapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.webapp.DAO.WordDAO;
import practice.webapp.Entity.SearchWord;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    WordDAO wordDAO;

    public List<String> listAllMatchingWords(String searchWord) {
        return wordDAO.findAllByMatchingKeyword(searchWord);
    }
}
