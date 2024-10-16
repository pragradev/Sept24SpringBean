package io.pragra.learning.july24springbean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private String company;
    private List<String> phoneNumbers;
    private Map<String,String> workEx;// RBC = 3, TD = 2, Scotia = 4


}
