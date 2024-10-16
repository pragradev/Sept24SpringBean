package io.pragra.learning.july24springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class July24SpringBeanApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

//        BMW m4 = new BMW("M4", "2024", 450, new DieselEngine(550));
//        System.out.println(m4);

        //Employee employee = new Employee("Asma", "S", "Amazon");
        //System.out.println(employee);

        //SpringApplication.run(July24SpringBeanApplication.class, args);
    }

}
