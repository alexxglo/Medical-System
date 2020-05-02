<<<<<<< HEAD
package structure;

import admin_sys_menu.Persistable;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedWriter;
public class Patient implements Persistable {

    private String patientName;
    private String patientSurname;
    private String illness;
    private String doctor;
    private String path = "C:\\Users\\Aly\\IdeaProjects\\Medical_system\\src\\structure\\patients.csv";

    public Patient() {
        this.patientName = "";

        this.patientSurname = "";

        this.illness = "";

        this.doctor = "";
    }

    public Patient(String patientName, String patientSurname, String illness, String doctor) {

        this.patientName = patientName;

        this.patientSurname = patientSurname;

        this.illness = illness;

        this.doctor = doctor;
    }

    public String return_patient_name() {

        return this.patientName;

    }

    public String return_patient_surname() {

        return this.patientSurname;

    }

    public String return_illness() {

        return this.illness;

    }

    public String return_doctor_name() {

        return this.doctor;

    }

    public void setPatientName(String patientName) {

        this.patientName = patientName;
    }

    public void setPatientSurname(String patientSurname) {

        this.patientSurname = patientSurname;
    }

    public void setIllness(String illness) {

        this.illness = illness;
    }

    public void setDoctor(String doctor) {

        this.doctor = doctor;
    }

    @Override

    public String toString() {

        return "\n Doctor " + doctor + " is helping " +
                patientName + " " + patientSurname;
    }

    @Override
    public void writeIn(Object x) throws IOException, ClassNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        bufferedWriter.append(((Patient) x).return_patient_name());

        bufferedWriter.append(",");

        bufferedWriter.append(((Patient) x).return_patient_surname());

        bufferedWriter.append(",");

        bufferedWriter.append(((Patient) x).return_illness());

        bufferedWriter.append(",");

        bufferedWriter.append(((Patient) x).return_doctor_name());

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }

    @Override
    public ArrayList<Object> readFrom() throws IOException {

        ArrayList<Object> patients = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record;
        record = bufferedReader.readLine();

        while ((record = bufferedReader.readLine()) != null) {

            String[] recordData = record.split(",");
            Patient x = new Patient();
            x.setPatientName(recordData[0]);

            x.setPatientSurname(recordData[1]);

            x.setIllness(recordData[2]);

            x.setDoctor(recordData[3]);

            patients.add(x);
        }

        return patients;
    }

    @Override
    public void writeHeader() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        bufferedWriter.append("Patient name");

        bufferedWriter.append(",");

        bufferedWriter.append("Surname");

        bufferedWriter.append(",");

        bufferedWriter.append("Ilness");

        bufferedWriter.append(",");

        bufferedWriter.append("Doctor");

        bufferedWriter.append("\n");

        bufferedWriter.close();

    }

}

=======
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
>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
