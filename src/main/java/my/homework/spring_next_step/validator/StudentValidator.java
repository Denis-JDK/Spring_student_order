package my.homework.spring_next_step.validator;

import lombok.Getter;
import lombok.Setter;
import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.answerAfterCheck.AnswerStudent;
@Setter
@Getter
public class StudentValidator {
    private String hostName;
    public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student check running: " + hostName);
        return new AnswerStudent();
    }
}
