package my.homework.spring_next_step.validator;

import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.answerAfterCheck.AnswerCityRegister;

public class CityRegisterValidator {
    String hostName;

         AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City Register is running:" + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.setSuccess(false);
        return ans;
    }
}
