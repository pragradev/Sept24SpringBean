package io.pragra.learning.july24springbean.config;

import io.pragra.learning.july24springbean.Employee;
import io.pragra.learning.july24springbean.EmployeeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setFirstName("Asma");
        employee.setLastName("S");
        return employee;
    }


}
