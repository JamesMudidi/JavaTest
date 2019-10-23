package com.james;

public class Doctor extends Person{
    String specialization;
    String availableTime;
    int monthlyPay;
    int transportAllowance;

    public Doctor(String name, int birthYear, String telephone, String address, String specialization, String availableTime, int monthlyPay, int transportAllowance) {
        super.name = name;
        super.birthYear = birthYear;
        super.telephone = telephone;
        super.address = address;
        this.specialization = specialization;
        this.availableTime = availableTime;
        this.monthlyPay = monthlyPay;
        this.transportAllowance = transportAllowance;
    }

    double calculatePay(){
        return monthlyPay + transportAllowance;
    }

    public void displayDoctor(){
        super.displayPerson();
        System.out.print("specialised in " +  specialization + ", is available from " + availableTime + " and is paid " + calculatePay() + " UShs per month.");
    }
}
