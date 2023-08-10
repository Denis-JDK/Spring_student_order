package my.homework.spring_next_step.lesson.decorator.notifier;

public class Send {

    public static void main(String[] args) {
        MessengerNotifier messengerNotifier = new MessengerNotifier("8763421112","I will be Java Development Extra Class");
        SmsNotifier smsNotifier = new SmsNotifier(messengerNotifier);
        String text = messengerNotifier.getText();
        int str = text.length();

        if(!messengerNotifier.notifySubscriber() & str<=160){
            smsNotifier.notifySubscriber();
        }else {
            messengerNotifier.notifySubscriber();
        }
    }
}
