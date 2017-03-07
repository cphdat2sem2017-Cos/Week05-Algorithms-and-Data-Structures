package CarsSort;

public class Car implements Comparable<Car>{

    private int yearMake;
    private String model, owner;
    private double price;

    public Car(int yearMake, String model, String owner, double price) {
        this.yearMake = yearMake;
        this.model = model;
        this.owner = owner;
        this.price = price;
    }

    public Car() {
        yearMake = 0;
        model = "";
        owner = "";
        price = 0.0;
    }

    public int getYearMake() {
        return yearMake;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public int compareTo(Car other) {
        if(getYearMake() > other.getYearMake()){
            return 1;
        } else if (getYearMake() < other.getYearMake()){
            return -1;
        } else {
            return 0;
        }
    }//comareTo

    @Override
    public String toString(){
        return ("Car model : "+getModel()+" || Owner's name : "+getOwner()+" |=| Price : "+getPrice()+" |#| Year make : "+getYearMake());
    }
    
}//class Car
