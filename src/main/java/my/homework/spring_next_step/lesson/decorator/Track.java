package my.homework.spring_next_step.lesson.decorator;

public class Track {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        SportCar sportCar = new SportCar(sedan);

        sportCar.switchTurbo();
        System.out.println(sportCar.getMaxSpeed());
    }
}
