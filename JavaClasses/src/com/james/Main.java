package com.james;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Doctor doctor = new Doctor(
                "Doctor James",
                1789,
                "0759888888",
                "Kampala",
                "Cancer treatment",
                "2:00pm",
                1200000,
                0
        );
        Patient patient = new Patient(
                "Patient Kim",
                1998,
                "0759888333",
                "London",
                "Malaria",
                6,
                40000
        );
        patient.displayPatient();
        doctor.displayDoctor();
    }
}
