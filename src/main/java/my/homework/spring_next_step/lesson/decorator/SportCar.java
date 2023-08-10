package my.homework.spring_next_step.lesson.decorator;

public class SportCar implements Car{
    private Car car;
    boolean turboMode;
    private final int SPEED_MAX= 50;

    public SportCar(Car car) {
        this.car = car;
    }

    @Override
    public int getMaxSpeed() {
        return this.car.getMaxSpeed() + (turboMode ? SPEED_MAX : 0);
    }

    public void switchTurbo(){
        this.turboMode = true;
    }
}
