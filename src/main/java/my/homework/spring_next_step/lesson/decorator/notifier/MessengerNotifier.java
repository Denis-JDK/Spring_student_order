package my.homework.spring_next_step.lesson.decorator.notifier;

public final class MessengerNotifier implements Notifier {
    private String phone;
    private String text;

    public MessengerNotifier(String phone, String text) {
        this.phone = phone;
        this.text = text;
    }

    public String getText(){
        return text;
    }

    @Override
    public boolean notifySubscriber() {
        System.out.println("MessengerNotifier");
        return true;
    }
}
