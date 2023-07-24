package my.homework.spring_next_step.validator;

import lombok.Getter;
import lombok.Setter;
import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.answerAfterCheck.AnswerChildren;
@Setter
@Getter
public class ChildrenValidator {
    private String hostName;
    public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check running: " + hostName);
        return new AnswerChildren();
    }
}
