package my.homework.spring_next_step;

import my.homework.spring_next_step.StudentOrder;
import my.homework.spring_next_step.domain_answerAfterCheck.Adult;
import org.springframework.beans.factory.annotation.Autowired;
//принимаем заявку от клиента и отдаем ему id по которому приняли заявку на рассмотрение в сервис
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;



       long ans = savaStudentOrder();
        System.out.println(ans);

    }
   public static long savaStudentOrder(){
        long answer = 199;
        System.out.println("Save is studentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult("number");
        husband.setGivenName("Евгений");
        so.setStudentOrderId(id);
        so.setHusband(husband);
        return so;
    }
}
