package my.homework.spring_next_step.lesson.observer.bank;

import java.time.LocalDate;

public class Creditor implements Observer{

    private int idNumber;
    private String name;
    private LocalDate startDate;
    private LocalDate sendMessageDate;

    public Creditor(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
        this.startDate = LocalDate.now();
        this.sendMessageDate = startDate.withMonth(startDate.getMonthValue()+1);
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getSendMessageDate() {
        return sendMessageDate;
    }

    @Override
    public void handle() {
        System.out.println("handle Creditor");

    }
}
