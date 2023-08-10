package my.homework.spring_next_step.lesson.observer;

public class ConcreteObserver implements Observer{
    private int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void handle() {
        System.out.println("handle ConcreteObserver");
    }
}
