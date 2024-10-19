package io.pragra.learning.july24springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class PragraplexOrder {

    @Autowired // setter based DI
    Movie movie;

//    public PragraplexOrder(Movie movie){
//        this.movie = movie; // Constuctor based DI
//    }

    public void movieOrder(Movie movieArg, List<Employee> employees){
        // ordering movie tickets
        //System.out.println(this.movie.getYear());
        System.out.println("ordering movie tickets");
    }

}
