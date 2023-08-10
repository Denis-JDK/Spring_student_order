package my.homework.spring_next_step.lesson.strategy;

public class PayContext {
    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    boolean pay(int paymentAmount, User user){
        return payStrategy.pay(paymentAmount, user);
    }

    public static void main(String[] args) {
        CreditCardApi api = new CreditCardApi();
        PaypalApi api1 = new PaypalApi();
        PayContext context = new PayContext(new PayCreditCard(api,100));
        context.pay(100, new User() );

        context.setPayStrategy(new PayByPaypal(api1));

        context.pay(100, new User());
    }
}
