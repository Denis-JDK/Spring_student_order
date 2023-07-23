package my.homework.spring_next_step;

import my.homework.spring_next_step.StudentOrder;
import org.springframework.beans.factory.annotation.Autowired;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;



       long ans = savaStudentOrder();
        System.out.println(ans);

    }
    static long savaStudentOrder(){
        long answer = 199;
        System.out.println("Save is studentOrder");
        return answer;
    }
}
