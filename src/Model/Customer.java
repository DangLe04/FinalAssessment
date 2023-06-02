package Model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name= "customer")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends User{

    private int quizCompleted;
    @OneToMany
    private List<SubmittedSurvey> surveys;

    public Customer() {
    }

    public int getQuizCompleted() {
        return quizCompleted;
    }

    public void setQuizCompleted(int quizCompleted) {
        this.quizCompleted = quizCompleted;
    }

    public List<SubmittedSurvey> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<SubmittedSurvey> surveys) {
        this.surveys = surveys;
    }
}
