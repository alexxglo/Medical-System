<<<<<<< HEAD
package structure;

import admin_sys_menu.Persistable;

import java.io.*;
import java.util.ArrayList;

public class Medication implements Persistable {

    private String medicationName;
    private String instructions;
    private String disease;
    private String path = "C:\\Users\\Aly\\IdeaProjects\\Medical_system\\src\\structure\\medication.csv";

    public Medication() {

        this.medicationName = "";

        this.instructions = "";

        this.disease = "";
    }

    public Medication(String medicationName, String instructions, String disease){

        this.medicationName = medicationName;

        this.instructions = instructions;

        this.disease = disease;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String return_medicationName(){

        return medicationName;

    }

    public String return_instructions(){

        return instructions;

    }

    public String return_disease(){

        return disease;
    }

    @Override

    public String toString(){

        return "\n Medication name: "  +  medicationName  +
                " Instructions: "  + instructions  +
                " Disease: "  + disease;
    }

    @Override
    public void writeIn(Object x) throws IOException, ClassNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        bufferedWriter.append(((Medication) x).return_medicationName());

        bufferedWriter.append(",");

        bufferedWriter.append(((Medication) x).return_instructions());

        bufferedWriter.append(",");

        bufferedWriter.append(((Medication) x).return_disease());

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }

    @Override
    public ArrayList<Object> readFrom() throws IOException, ClassNotFoundException {

        ArrayList<Object> medications = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record;
        record = bufferedReader.readLine();
        while ((record = bufferedReader.readLine()) != null) {

            String[] recordData = record.split(",");
            Medication x = new Medication();
            x.setMedicationName(recordData[0]);

            x.setInstructions(recordData[1]);

            x.setDisease(recordData[2]);

            medications.add(x);
        }

        return medications;
    }

    @Override
    public void writeHeader() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        bufferedWriter.append("Medication");

        bufferedWriter.append(",");

        bufferedWriter.append("Instructions");

        bufferedWriter.append(",");

        bufferedWriter.append("Disease");

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }
}
=======
package structure;

public class Medication {

    private String medicationName;
    private String instructions;
    private String disease;

    public Medication(String medicationName, String instructions, String disease){

        this.medicationName = medicationName;

        this.instructions = instructions;

        this.disease = disease;
    }

    public String return_medicationName(){

        return medicationName;

    }

    public String return_instructions(){

        return instructions;

    }

    public String return_disease(){

        return disease;
    }

    @Override

    public String toString(){

        return "\n Medication name: "  +  medicationName  +
                " Instructions: "  + instructions  +
                " Disease: "  + disease;
    }
}
>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
