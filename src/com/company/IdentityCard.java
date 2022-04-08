package com.company;

public class IdentityCard {

    String number;
    String Name;
    String Surname;
    String date;

   void printInfo () {
    String idd = "Identity Card details:";
       System.out.println(idd + number + "," + Name + " " + Surname + "," + date);

    }


}
