package Model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "SubmittedSurvey")
public class SubmittedSurvey implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int submittedSurveyId;
    @ManyToOne
    private Customer user;
}
