package my.homework.spring_next_step.validator;

import lombok.Getter;
import lombok.Setter;
import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.answerAfterCheck.AnswerWedding;
@Setter
@Getter
public class WeddingValidator {
    private String hostName;

    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Weeding check running: " + hostName);
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }
}
