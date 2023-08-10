package my.homework.spring_next_step.lesson.observer.bank;

public interface ObservableBank {

    void addCreditor(Creditor c);
    void removeCreditor(Creditor c);
    void notifyCreditor();
}
