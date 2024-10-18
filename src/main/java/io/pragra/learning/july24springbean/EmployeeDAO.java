package io.pragra.learning.july24springbean;

import lombok.Data;

import java.time.Instant;

@Data
public class EmployeeDAO {
    private final String url;
    private final String userName;
    private final String pwd;

    public void establishConnection(){
        // initiate hibernate/session factory object/ DB connection object
        System.out.println( Instant.now() + " database connection established");
    }

    public void releaserConnection(){
        // release connection/ close buffer with file/db
        System.out.println(Instant.now() + " Database connection released");
    }

    public void persistEmp(Employee employee){
        //persisting emp
    }




}
