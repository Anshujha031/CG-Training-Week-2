import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors; // Association with doctors

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Maintain bidirectional relationship
        }
    }

    public void showDoctors() {
        System.out.println(name + " is consulting the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients; // Association with patients

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Maintain bidirectional relationship
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println(name + " is consulting with " + patient.getName());
        } else {
            System.out.println(name + " is not associated with " + patient.getName());
        }
    }

    public void showPatients() {
        System.out.println(name + " is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main class to demonstrate functionality
public class DoctorAndPatients {
    public static void main(String[] args) {
        // Create a Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor drSmith = new Doctor("Dr. Smith");
        Doctor drJones = new Doctor("Dr. Jones");

        // Create Patients
        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        // Add Doctors and Patients to Hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        // Establish relationships between Doctors and Patients
        drSmith.addPatient(alice);
        drJones.addPatient(bob);
        drJones.addPatient(alice);

        // Show Hospital Details
        hospital.showDetails();

        // Show doctor-patient relationships
        drSmith.showPatients();
        drJones.showPatients();

        alice.showDoctors();
        bob.showDoctors();

        // Demonstrate consultations
        drSmith.consult(alice);
        drJones.consult(bob);
        drSmith.consult(bob); // Example of no association
    }
}
