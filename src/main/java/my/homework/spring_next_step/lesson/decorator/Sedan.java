package my.homework.spring_next_step.lesson.decorator;

public class Sedan implements Car {
private final int MAX_SPEED = 150;

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
