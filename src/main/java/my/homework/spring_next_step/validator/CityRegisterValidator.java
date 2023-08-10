package my.homework.spring_next_step.validator;

import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.checkers.RealCityRegisterChecker;
import my.homework.spring_next_step.domain_answerAfterCheck.AnswerCityRegister;

public class CityRegisterValidator {
    private String hostName;
    private int port;
    private String login;

    public RealCityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }


    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();


        ans.setSuccess(false);
        return ans;
    }
}
