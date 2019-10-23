package com.james;

public class Person {
    String name;
    int birthYear;
    String telephone;
    String address;

    public void Person(
            String name,
            int birthYear,
            String telephone,
            String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.telephone = telephone;
        this.address = address;
    }

    int getAge(int year){
        return 2019-this.birthYear;
    }

    public void displayPerson(){
        System.out.print(name + ", " + "aged " + getAge(2019) + " years, ");
    }
}
