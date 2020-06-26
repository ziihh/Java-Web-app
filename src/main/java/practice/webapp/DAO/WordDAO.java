package practice.webapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.webapp.Entity.Word;

import java.util.List;

@Repository
public interface WordDAO extends JpaRepository<Word, Integer> {

    Word findByWord(String word);
}
