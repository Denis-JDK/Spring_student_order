package my.homework.spring_next_step.lesson.strategy;

public class PayCreditCard implements PayStrategy{
    private final CreditCardApi api;
    private int commission;

    public PayCreditCard(CreditCardApi api, int commission) {
        this.api = api;
        this.commission = 100;
    }


    @Override
    public boolean pay(int paymentAmount, User user) {
        if (api.authorize(user)){
            paymentAmount-=paymentAmount - commission*paymentAmount;
            return api.pay(paymentAmount);
        }else {
            return false;
        }

    }
}
