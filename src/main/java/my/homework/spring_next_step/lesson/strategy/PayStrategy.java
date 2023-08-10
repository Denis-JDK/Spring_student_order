package my.homework.spring_next_step.lesson.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount, User user);
}
