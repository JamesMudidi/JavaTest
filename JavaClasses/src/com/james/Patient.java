package com.james;

public class Patient extends Person{
    String diagnosis;
    int noOfVisitingTimes;
    int consultationFee;

    public Patient(String name, int birthYear, String telephone, String address, String diagnosis, int noOfVisitingTimes, int consultationFee) {
        super.name = name;
        super.birthYear = birthYear;
        super.telephone = telephone;
        super.address = address;
        this.diagnosis = diagnosis;
        this.noOfVisitingTimes = noOfVisitingTimes;
        this.consultationFee = consultationFee;
    }
    double totalFee(){
        return consultationFee * noOfVisitingTimes;
    }

    public void displayPatient(){
        super.displayPerson();
        System.out.print("has visited " +  noOfVisitingTimes + " times and has paid " + consultationFee + " UShs as consultation fee.\n");
    }
}
