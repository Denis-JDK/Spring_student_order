package my.homework.spring_next_step.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import my.homework.spring_next_step.StudentOrder;

public class ConfigurationSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       StudentOrder so = context.getBean("studentOrder", StudentOrder.class);
        System.out.println(so.getHFirstName());

        context.close();
    }





}
