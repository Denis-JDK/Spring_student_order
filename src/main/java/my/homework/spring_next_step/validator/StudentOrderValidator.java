package my.homework.spring_next_step.validator;

import my.homework.spring_next_step.SaveStudentOrder;
import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.domain_answerAfterCheck.AnswerChildren;
import my.homework.spring_next_step.domain_answerAfterCheck.AnswerCityRegister;
import my.homework.spring_next_step.domain_answerAfterCheck.AnswerStudent;
import my.homework.spring_next_step.domain_answerAfterCheck.AnswerWedding;
import my.homework.spring_next_step.mail.SendMail;

//проверка студенческой заявки, считываем заявку из БД и проверяем
public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private WeddingValidator weddingValidator;
    private SendMail sendMail;


   private StudentOrder so;

    public void setCityRegisterValidator(CityRegisterValidator cityRegisterValidator) {
        this.cityRegisterValidator = cityRegisterValidator;
    }

    public void setChildrenValidator(ChildrenValidator childrenValidator) {
        this.childrenValidator = childrenValidator;
    }

    public void setStudentValidator(StudentValidator studentValidator) {
        this.studentValidator = studentValidator;
    }

    public void setWeddingValidator(WeddingValidator weddingValidator) {
        this.weddingValidator = weddingValidator;
    }

    public void setSendMail(SendMail sendMail) {
        this.sendMail = sendMail;
    }

    public void setSo(StudentOrder so) {
        this.so = so;
    }

    public StudentOrderValidator() {
        childrenValidator= new ChildrenValidator();
        cityRegisterValidator = new CityRegisterValidator();
        studentValidator = new StudentValidator();
        weddingValidator= new WeddingValidator();
        sendMail=new SendMail();
    }


    public static void main(String[] args) {

       StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
       studentOrderValidator.checkAll();

    }

    public void checkAll() {
            StudentOrder[] soArray = readStudentOrderFromDB();
            for(int i =0; i<soArray.length;i++){
                checkOneOrder(soArray[i]);

            }

    }

    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegisterValidator(so);
        AnswerWedding wedAnswer = checkWeddingValidator(so);
        AnswerStudent stAnswer = checkStudentValidator(so);
        AnswerChildren childAnswer = checkChildrenValidator(so);

        sendMailValidator();
    }

    public StudentOrder[] readStudentOrderFromDB() {
        StudentOrder[] soArray = new StudentOrder[3];
        for (int i = 0; i<soArray.length; i++){
            soArray[i]=SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }




    public AnswerCityRegister checkCityRegisterValidator(StudentOrder so){
        return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding checkWeddingValidator(StudentOrder so){
        return weddingValidator.checkWedding(so);
    }

    public AnswerStudent checkStudentValidator(StudentOrder so){
        return studentValidator.checkStudent(so);
    }
    public AnswerChildren checkChildrenValidator(StudentOrder so){
        return childrenValidator.checkChildren(so);
    }
    public void sendMailValidator() {
        sendMail.sendMail();
    }

}

