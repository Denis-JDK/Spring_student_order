package my.homework.spring_next_step.lesson.strategy;

public class PaypalApi {
    boolean authorize(User user) {
        if (!user.getPassword().isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    boolean pay(int paymentAmount){
        System.out.println("transaction completed");
        return true;
    }
}
