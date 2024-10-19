package io.pragra.learning.july24springbean.config;

import io.pragra.learning.july24springbean.Employee;
import io.pragra.learning.july24springbean.EmployeeDAO;
import io.pragra.learning.july24springbean.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource(value = "names.properties")
public class appConfig {
    @Value("#{'${firstName2}'.substring(2)}") // #{}
    String fName;
    @Value("${lastName2}")
    String lName;

    @Bean
    @Scope(value = "singleton")
    public Employee employee(){
        Employee employee = new Employee();
        employee.setFirstName(fName);
        employee.setLastName(lName);
        return employee;
    }

    @Bean
    public String getName(){
        return "Dune";
    }




}
