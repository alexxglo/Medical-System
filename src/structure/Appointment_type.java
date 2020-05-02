<<<<<<< HEAD
package structure;

import admin_sys_menu.Persistable;

import java.io.*;
import java.util.ArrayList;


public class Appointment_type implements Persistable {

    private String appointmentContainings;

    private double appointment_typeDuration;

    private String path = "C:\\Users\\Aly\\IdeaProjects\\Medical_system\\src\\structure\\appointmentTypes.csv";

    public Appointment_type() {
    }

    public Appointment_type(String appointmentContainings, double appointment_typeDuration) {

        this.appointmentContainings = appointmentContainings;

        this.appointment_typeDuration = appointment_typeDuration;

    }

    public Appointment_type(String whatever, String whenever){
        this.appointmentContainings = whatever;
        this.appointment_typeDuration = Integer.parseInt(whenever);
    }


    public String getAppointmentContainings() {

        return appointmentContainings;

    }



    public void setAppointmentContainings(String appointmentContainings) {

        this.appointmentContainings = appointmentContainings;

    }



    public double getAppointment_typeDuration() {

        return appointment_typeDuration;

    }



    public void setAppointment_typeDuration(double appointment_typeDuration) {

        this.appointment_typeDuration = appointment_typeDuration;

    }



    @Override

    public String toString() {

        return "Appointment Type: " +

                "Containings = " + appointmentContainings +

                ", Duration = " + appointment_typeDuration + " minutes"

                + "\n"

                ;

    }

    @Override
    public void writeIn(Object x) throws IOException, ClassNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        bufferedWriter.append(((Appointment_type) x).getAppointmentContainings());

        bufferedWriter.append(",");

        bufferedWriter.append((char) ((Appointment_type) x).getAppointment_typeDuration());

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }

    @Override
    public ArrayList<Object> readFrom() throws IOException, ClassNotFoundException {

        ArrayList<Object> appointmentType = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record;
        record = bufferedReader.readLine();
        while ((record = bufferedReader.readLine()) != null) {

            String[] recordData = record.split(",");

            Appointment_type x = new Appointment_type();

            x.setAppointmentContainings(recordData[0]);

            x.setAppointment_typeDuration(Double.parseDouble(recordData[1]));

            appointmentType.add(x);
        }

        return appointmentType;
    }


    @Override
    public void writeHeader() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        bufferedWriter.append("Appointment Containings");

        bufferedWriter.append(",");

        bufferedWriter.append("Duration");

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }
=======
package structure;

import java.util.ArrayList;

import java.util.List;



public class Appointment_type {

    private List<String> appointmentContainings =  new ArrayList<>();

    private double appointment_typePrice;



    public Appointment_type(List<String> appointmentContainings, double appointment_typePrice) {

        this.appointmentContainings = appointmentContainings;

        this.appointment_typePrice = appointment_typePrice;

    }



    public List<String> getAppointmentContainings() {

        return appointmentContainings;

    }



    public void setAppointmentContainings(List<String> appointmentContainings) {

        this.appointmentContainings = appointmentContainings;

    }



    public double getAppointment_typePrice() {

        return appointment_typePrice;

    }



    public void setAppointment_typePrice(double appointment_typePrice) {

        this.appointment_typePrice = appointment_typePrice;

    }



    @Override

    public String toString() {

        return "Appointment Type: " +

                "Containings = " + appointmentContainings +

                ", Price = " + appointment_typePrice + "\n"

                ;

    }

>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
}