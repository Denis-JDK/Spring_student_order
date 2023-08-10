package my.homework.spring_next_step.lesson;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int shoot;
        while (true){
            if (sc.hasNextInt()){
                shoot = sc.nextInt();
                if(shoot< 0||shoot>9){
                    System.out.println("Вы ввели неверное число для выстрела.");
                    System.out.println("Введите число от 0 до 9 для выстрела");
                    continue;
                }
                break;
            }else {
                String temp = sc.nextLine();
                System.out.println("Вы ввели неверное число для выстрела.");
                System.out.println("Введите число от 0 до 9 для выстрела");
            }
        }
    }
}
