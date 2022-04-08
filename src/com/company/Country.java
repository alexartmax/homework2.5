package com.company;

public class Country {

    String name;
    int population;
    int inflation;

    void printInfo () {
        String str = "Country Info:";
        System.out.println(str + name + "," + population + "," + inflation);
    }
}
