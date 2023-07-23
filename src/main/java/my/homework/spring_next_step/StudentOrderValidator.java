package my.homework.spring_next_step;

import my.homework.spring_next_step.answerAfterCheck.AnswerChildren;
import my.homework.spring_next_step.answerAfterCheck.AnswerCityRegister;
import my.homework.spring_next_step.answerAfterCheck.AnswerStudent;
import my.homework.spring_next_step.answerAfterCheck.AnswerWedding;

//проверка студенческой заявки, считываем заявку из БД и проверяем
public class StudentOrderValidator {
    public static void main(String[] args) {

        checkAll();


    }
    static StudentOrder readStudentOrderFromDB(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    static void checkAll(){
        StudentOrder so = readStudentOrderFromDB();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWeeding(so);
        AnswerStudent stAnswer = checkStudent(so);
        AnswerChildren childAnswer = checkChildren(so);

        sendMail(so);
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is running");
        return new AnswerCityRegister();
    }

    static AnswerWedding checkWeeding(StudentOrder so){
        System.out.println("Weeding check running");
        return new AnswerWedding();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student check running");
        return new AnswerStudent();
    }
    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check running");
        return new AnswerChildren();
    }
    private static void sendMail(StudentOrder so) {
    }

}
