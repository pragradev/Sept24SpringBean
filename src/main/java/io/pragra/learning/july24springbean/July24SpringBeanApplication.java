package io.pragra.learning.july24springbean;

import io.pragra.learning.july24springbean.config.appConfig;
import io.pragra.learning.july24springbean.databseConfiguration.DBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class July24SpringBeanApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.july24springbean.config"
                ,"io.pragra.learning.july24springbean.databseConfiguration");

//        ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class, DBConfig.class);


        Employee employee = context.getBean(Employee.class);
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
        System.out.println("employee =" + employee);
        System.out.println("employeeDao =" + employeeDAO );

        ((AnnotationConfigApplicationContext) context).registerShutdownHook();

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//
//        Employee employee = context.getBean(Employee.class);// Factory design pattern
//        System.out.println(employee);
//        DieselEngine dieselEngine = context.getBean(DieselEngine.class);
//        BMW m5 = context.getBean("m5",BMW.class);
//        BMW m3 = context.getBean("m3",BMW.class);
//        System.out.println("M5 = " + m5);
//        System.out.println("M3 = " + m3);
//        System.out.println(dieselEngine);
//
//        context.registerShutdownHook();

//        BMW m4 = new BMW("M4", "2024", 450, new DieselEngine(550));
//        System.out.println(m4);

        //Employee employee = new Employee("Asma", "S", "Amazon");
        //System.out.println(employee);

        //SpringApplication.run(July24SpringBeanApplication.class, args);
    }

}
