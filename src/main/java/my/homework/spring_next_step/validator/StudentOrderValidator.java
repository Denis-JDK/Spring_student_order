package my.homework.spring_next_step.validator;

import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.answerAfterCheck.AnswerChildren;
import my.homework.spring_next_step.answerAfterCheck.AnswerCityRegister;
import my.homework.spring_next_step.answerAfterCheck.AnswerStudent;
import my.homework.spring_next_step.answerAfterCheck.AnswerWedding;

//проверка студенческой заявки, считываем заявку из БД и проверяем
public class StudentOrderValidator {

    StudentOrder so;

    public static void main(String[] args) {

       StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
       studentOrderValidator.checkAll();

    }

    public void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrderFromDB();

            if (so == null) {
                break; //если заявка null, значит мы все заявки обработали. Прерываем полностью цикл
            }

            AnswerCityRegister cityAnswer = checkCityRegisterValidator(so);
            if (!cityAnswer.isSuccess()) {
                // continue; //прекращаем обработку текущей заявки, возвращаемся в начало цикла и переходим к следующей заявки
                break;
            }

            AnswerWedding wedAnswer = checkWeddingValidator(so);
            AnswerStudent stAnswer = checkStudentValidator(so);
            AnswerChildren childAnswer = checkChildrenValidator(so);

            sendMailValidator(so);
        }
    }

    public StudentOrder readStudentOrderFromDB() {
        // StudentOrder so = new StudentOrder();
        return so;
    }




    static AnswerCityRegister checkCityRegisterValidator(StudentOrder so){
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName="Host CityRegister";
        AnswerCityRegister ans = crv.checkCityRegister(so);
        return ans;
    }

    static AnswerWedding checkWeddingValidator(StudentOrder so){
        WeddingValidator wv = new WeddingValidator();
        wv.setHostName("Host Wedding");
        AnswerWedding ans = wv.checkWedding(so);
        return ans;
    }

    static AnswerStudent checkStudentValidator(StudentOrder so){
        StudentValidator sv= new StudentValidator();
        sv.setHostName("Host Student");
        AnswerStudent ans = sv.checkStudent(so);
        return ans;
    }
    static AnswerChildren checkChildrenValidator(StudentOrder so){
        ChildrenValidator chv = new ChildrenValidator();
        chv.setHostName("Host Child");
        AnswerChildren ans = chv.checkChildren(so);
        return ans;
    }
    static void sendMailValidator(StudentOrder so) {
        System.out.println("email send");
    }

}

