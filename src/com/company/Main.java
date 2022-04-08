package com.company;

public class Main {

    public static void main(String[] args) {

        IdentityCard id = new IdentityCard();
        id.number = "FBI123455";
        id.Name = "Alex";
        id.Surname = "Artmax";
        id.date = "12/95";
        id.printInfo();

        Country country = new Country();

        country.name = "Ukraine";
        country.population = Integer.parseInt("45000000");
        country.inflation = Integer.parseInt("10");
        country.printInfo();

        Car car = new Car();

        car.model = "Tesla";
        car.year = "2022";
        car.color = "black";
        car.cost = "100000";
        car.printInfo();
    }
}
