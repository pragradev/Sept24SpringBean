package io.pragra.learning.july24springbean;

import lombok.Data;

@Data
public class DieselEngine implements IEngine{
    private String engineType;
    private Integer horsePower;

    public DieselEngine(Integer horsePower) {
        this.engineType = "Diesel Engine";
        this.horsePower = horsePower;
    }

    @Override
    public void display() {
        System.out.println("Diesel Engine with " + horsePower + " HP.");
    }
}
