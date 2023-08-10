package my.homework.spring_next_step.lesson.decorator.notifier;

public class SmsNotifier implements Notifier{
    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;

    }



    @Override
    public boolean notifySubscriber() {
        System.out.println("SMSNotifier");
        return this.notifier.notifySubscriber();
    }
}
