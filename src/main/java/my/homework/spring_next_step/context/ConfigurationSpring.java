package my.homework.spring_next_step.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.close();
    }





}
