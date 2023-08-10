package my.homework.spring_next_step.lesson.observer.bank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Bank implements ObservableBank{

    private List<Creditor> creditors;

    public Bank() {
        this.creditors = new ArrayList<>();
    }

    public static void main(String[] args) {
        Creditor cr = new Creditor(1,"Ivan");


        System.out.println( cr.getStartDate()+" "+ cr.getSendMessageDate());


        Bank bank = new Bank();
        bank.addCreditor(cr);
        bank.sendNotifications(bank.creditors);
    }

    public void sendNotifications(List<Creditor> creditors){
        for (Creditor creditor:creditors){
            if (creditor.getStartDate().isAfter(creditor.getSendMessageDate())){
                sendEmail(creditor);
            }

            }
        }

    @Override
    public void addCreditor(Creditor c) {
        creditors.add(c);


    }

    @Override
    public void removeCreditor(Creditor c) {
        creditors.remove(c);

    }

    @Override
    public void notifyCreditor() {
        for (Creditor creditor: creditors){
            creditor.handle();
        }
    }
    public void sendEmail(Creditor c){
        System.out.println("Уважаемый " + c.getName() + ", внесите платеж.");
    }
}
