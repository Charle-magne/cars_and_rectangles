package se.lexicon.carl;

public class Car {
    String id;
    int year;
    String model;
    String color;
    int motorSize;

    public Car (String id, int year, String model, String color, int motorSize){
        this.id = id;
        this.motorSize = motorSize;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public String getId(){
        return id;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public int getMotorSize(){
        return motorSize;
    }

    public void drive(){
        System.out.println("The " + year + " " + model + " is ready to drive.");
    }
}
