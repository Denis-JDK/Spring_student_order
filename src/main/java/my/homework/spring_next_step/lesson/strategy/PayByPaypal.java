package my.homework.spring_next_step.lesson.strategy;

public class PayByPaypal implements PayStrategy{

    private final PaypalApi api;

    public PayByPaypal(PaypalApi api) {
        this.api = api;
    }

    @Override
    public boolean pay(int paymentAmount, User user) {
        if (api.authorize(user)){
            return api.pay(paymentAmount);
        }else {
            return false;
        }

    }
}
