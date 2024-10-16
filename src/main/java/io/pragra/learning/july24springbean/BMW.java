package io.pragra.learning.july24springbean;

import lombok.Data;

@Data
public class BMW {

    private String model;
    private IEngine engine;
    private String year;

    public BMW(String model, String year, Integer hp, IEngine engine){
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
}
