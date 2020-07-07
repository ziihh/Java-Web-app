package practice.webapp.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import practice.webapp.Entity.Word;
import practice.webapp.Service.WordService;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SearchController.class)
class SearchControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    WordService wordService;

    void asJsonString() {

    }

    class Request {

        Request(String keyword) {
            this.keyword = keyword;
        }

        public String keyword;

    }



    @Test
    void search() throws Exception {
        Word word = new Word(1, "apple", "Fruit", "I ate apple yesterday", "I will eat apple tomorrow");

        Request request = new Request("apple");
        String body = (new ObjectMapper()).valueToTree(request).toString();
        System.out.print(body);
        mvc.perform(post("/search")
                .content(body)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$", 1))
                .andExpect((ResultMatcher) jsonPath("$[0].word", is(word.getWord())));
    }
}