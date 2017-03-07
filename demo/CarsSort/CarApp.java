package CarsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarApp implements Comparator<Car>{

    public static void main(String[] args) {
        Car car1 = new Car(2017,"Tesla Model S", "Petru Catana", 420300);
        Car car2 = new Car(1981,"VW Polo mk2", "Mathias Jepsen", 1877);
        Car car3 = new Car(1970,"VW Golf 2", "Lovro", 1240);
        Car car4 = new Car(2016,"Skoda Superb", "Peter Mihok", 21340);
        Car car5 = new Car(2012,"Brabus EV12", "Istvan Farkas", 168000);
        Car car6 = new Car(2016,"Dodge Durango", "Andrian Vangelov", 32100);
        Car car7 = new Car(2015,"Skoda Yeti", "Adam Becvar", 22000);
        Car car8 = new Car(2016,"Aston Martin DB11", "Felesiah Krøier", 475000);
        Car car9 = new Car(2003,"Seat Cordoba", "Casper", 3547);
        Car car10 = new Car(2015,"McLaren P1", "Arkadiusz", 500000);
        Car car11 = new Car(2012,"Batmobile", "Bruce wayne", 300000);
        Car car12 = new Car(2007,"Lada C", "Alyona", 30000);
        Car car13 = new Car(1970,"Lada VAZ-2101", "Putin", 400);
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(car1);
        listOfCars.add(car2);
        listOfCars.add(car3);
        listOfCars.add(car4);
        listOfCars.add(car5);
        listOfCars.add(car6);
        listOfCars.add(car7);
        listOfCars.add(car8);
        listOfCars.add(car9);
        listOfCars.add(car10);
        listOfCars.add(car11);
        listOfCars.add(car12);
        listOfCars.add(car13);
        Collections.sort(listOfCars);
        System.out.println("====================");
        System.out.println("= Sorted by year : =");
        System.out.println("====================");
        for(Car c : listOfCars){
            System.out.println(c.toString());
        }
        
        Comparator comparator = new CarApp();
        Collections.sort(listOfCars, comparator);
        System.out.println("                 ");
        System.out.println("=====================");
        System.out.println("= Sorted by model : =");
        System.out.println("=====================");
        for(Car c : listOfCars){
            System.out.println(c.toString());
        }
    }//main
    
    
    
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getModel().compareTo(c2.getModel());
    }//compare

}
