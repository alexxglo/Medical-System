package structure;

public class Patient {

    private String patientName;
    private String patientSurname;
    private String illness;
    private String doctor;

    public Patient(String patientName, String patientSurname, String illness, String doctor){

        this.patientName = patientName;

        this.patientSurname = patientSurname;

        this.illness = illness;

        this.doctor = doctor;
    }

    public String return_patient_name(){

        return this.patientName;

    }

    public String return_patient_surname(){

        return this.patientSurname;

    }

    public String return_illness(){

        return this.illness;

    }

    public String return_doctor_name(){

        return this.doctor;

    }

    @Override

    public String toString(){

        return "\n Doctor " + doctor + " has helped " +
                patientName + " " + patientSurname;
    }
}
