package io.pragra.learning.july24springbean.databseConfiguration;

import io.pragra.learning.july24springbean.EmployeeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
    @Bean(initMethod = "establishConnection", destroyMethod = "releaserConnection")
    public EmployeeDAO employeeDAO(){
        EmployeeDAO employeeDAO = new EmployeeDAO("jdbc:oracle:172.68.52.3:1521/empDB",
                "sysadmin", "a7s8f7sd8fHgFF9");
        return employeeDAO;

    }
}
