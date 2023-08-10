package my.homework.spring_next_step.lesson.observer;

import java.util.List;

public class ConcreteObservable implements Observable{

    private List<Observer> observer;

    public ConcreteObservable(List<Observer> observer) {
        this.observer = observer;
    }

    @Override
    public void addObserver(Observer o) {
        observer.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observer.remove(o);

    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observer) {
            observer.handle();
        }

    }
}
