public class Task3 {/*
Create a Class Car that would have the following fields:
carPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 subclasses: Sedan and Truck.
The Truck class has field as weight and has its own implementation of calculateSalePrice() method i
n which returned price calculated as following: if weight>2000 then returned price car
should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
otherwise 10% discount
 */}
abstract class Car {
    double carPrice;
    String color;
    public Car(double carPrice, String color) {
        this.carPrice= carPrice;
        this.color= color;
    }
    abstract double calculateSalePrice();
    }
    class Sedan extends Car{
        double length;
        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }
        @Override
        double calculateSalePrice() {
            if (length>20){
               return carPrice*.95;
            }else {
                return carPrice*.9;
            }
        }
    }
    class Truck extends Car {
        double weight;
        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }
        @Override
        double calculateSalePrice() {
            if (weight > 2000) {
                return carPrice * 0.9;
            } else {
                return carPrice * 0.8;
            }
        }
    }

    class CarTester{
    public static void main(String[] args) {
        Sedan sedan = new Sedan(30000, "black", 15);
        System.out.println("The original price of the Sedan #1 is "+sedan.carPrice+ ".Sedan #1 length is "+sedan.length +" feet" );
        System.out.println("The price of Sedan #1 after the discount is " + sedan.calculateSalePrice());
        Sedan sedan2 = new Sedan(30000, "black", 22);
        System.out.println("The original price of the Sedan #2 is "+sedan2.carPrice+ ".Sedan #2 length is "+sedan2.length +" feet" );
        System.out.println("The price of Sedan #2 after the discount is " + sedan2.calculateSalePrice());
        Truck truck=new Truck(60000, "White", 1800);
        System.out.println("The original price of Truck #1 is "+truck.carPrice+ ".Truck #1 weight is "+truck.weight+ " lb" );
        System.out.println("The price of Truck #1 after the discount is " + truck.calculateSalePrice());
        Truck truck2=new Truck(60000, "sliver", 2200);
        System.out.println("The original price of Truck #2 is "+truck2.carPrice+ ".Truck #2 weight is "+truck2.weight +" lb");
        System.out.println("The price of Truck #2 after the discount is " + truck2.calculateSalePrice());

    }
    }


