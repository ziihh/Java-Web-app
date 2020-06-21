package practice.webapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Word {

    private Integer wId;
    private String word;
    private String description;
    private String example;
}
