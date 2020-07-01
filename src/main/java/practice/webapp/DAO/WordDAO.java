package practice.webapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import practice.webapp.Entity.Word;

import java.util.List;

@Repository
public interface WordDAO extends JpaRepository<Word, Integer> {

    Word findByWord(String word);

    @Query(value = "SELECT word FROM words WHERE word LIKE ?1% LIMIT 5", nativeQuery = true)
    List<String> findAllByMatchingKeyword(String keyword);

}
