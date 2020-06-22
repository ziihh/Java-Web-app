package practice.webapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "words")
public class Word {

    @Id
    @Column(name = "wId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wId;

    @Column(name = "word")
    @NotNull
    private String word;

    @Column(name = "definition")
    @NotNull
    private String definition;

    @Column(name = "example")
    @NotNull
    private String example;

    @Column(name = "secondexample")
    private String secondexample;
}
