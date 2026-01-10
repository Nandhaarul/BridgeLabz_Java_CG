package ObjectOrientedProgramming.ObjectModeling.Self;

import java.util.ArrayList;

class Doctor {
    String name;
    String specialization;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.doctors.add(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.name);
    }
}

class Patient {
    String name;
    int age;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void viewDoctors() {
        System.out.println("Patient " + name + " consulted doctors:");
        for (Doctor d : doctors) {
            System.out.println(d.name + " (" + d.specialization + ")");
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Nandha Arul", "Cardiology");
        Doctor d2 = new Doctor("Rahul", "Neurology");

        Patient p1 = new Patient("Anita", 30);
        Patient p2 = new Patient("Karthik", 45);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        p1.viewDoctors();
        p2.viewDoctors();
    }
}


