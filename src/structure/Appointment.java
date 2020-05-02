<<<<<<< HEAD
package structure;


import admin_sys_menu.Persistable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Appointment implements Persistable {

    private int appointmentNo;

    private double appointmentPrice;

    private Appointment_type appointmentType;

    private String path = "C:\\Users\\Aly\\IdeaProjects\\Medical_system\\src\\structure\\appointments.csv";

    public Appointment() {

    }

    public Appointment(int appointmentNo, double appointmentPrice) {

        this.appointmentNo = appointmentNo;

        this.appointmentPrice = appointmentPrice;

    }



    public Appointment(int appointmentNo, double appointmentPrice, Appointment_type appointmentType) {

        this.appointmentNo = appointmentNo;

        this.appointmentPrice = appointmentPrice;

        this.appointmentType = appointmentType;

    }



    public int getAppointmentNo() {

        return appointmentNo;

    }



    public void setAppointmentNo(int appointmentNo) {

        this.appointmentNo = appointmentNo;

    }



    public double getAppointmentPrice() {

        return appointmentPrice;

    }



    public void setAppointmentPrice(double appointmentPrice) {

        this.appointmentPrice = appointmentPrice;

    }



    public Appointment_type getAppointmentType() {

        return appointmentType;

    }



    public void setAppointmentType(Appointment_type appointmentType) {

        this.appointmentType = appointmentType;

    }



    @Override

    public String toString() {

        return "\n Appointment number " +

                 + appointmentNo +

                ", priced at: " + appointmentPrice +

                " and having the following procedure done: " + appointmentType

                ;

    }

    @Override
    public void writeIn(Object x) throws IOException, ClassNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        bufferedWriter.append((char) ((Appointment) x).getAppointmentNo());

        bufferedWriter.append(",");

        bufferedWriter.append((char) ((Appointment) x).getAppointmentPrice());

        bufferedWriter.append(",");

        bufferedWriter.append((CharSequence) ((Appointment) x).getAppointmentType());

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }

    @Override
    public ArrayList<Object> readFrom() throws IOException, ClassNotFoundException {

        ArrayList<Object> appointments = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record;
        record = bufferedReader.readLine();
        while ((record = bufferedReader.readLine()) != null) {

            String[] recordData = record.split(",");

            Appointment x = new Appointment();

            List<Appointment> list = new ArrayList<>();

            x.setAppointmentNo(Integer.parseInt(recordData[0]));

            x.setAppointmentPrice(Double.parseDouble(recordData[1]));

            x.setAppointmentType(new Appointment_type(recordData[2],recordData[3]));

            appointments.add(x);
        }

        return appointments;

    }

    @Override
    public void writeHeader() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        bufferedWriter.append("Appointment");

        bufferedWriter.append(",");

        bufferedWriter.append("Price");

        bufferedWriter.append(",");

        bufferedWriter.append("Type");

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }
=======
package structure;



        import java.util.ArrayList;

        import java.util.List;



public class Appointment {

    private int appointmentNo;

    private double appointmentPrice;

    private List<Appointment_type> appointmentsOrdered = new ArrayList<>();



    public Appointment(int appointmentNo, double appointmentPrice) {

        this.appointmentNo = appointmentNo;

        this.appointmentPrice = appointmentPrice;

    }



    public Appointment(int appointmentNo, double appointmentPrice, List<Appointment_type> appointmentsOrdered) {

        this.appointmentNo = appointmentNo;

        this.appointmentPrice = appointmentPrice;

        this.appointmentsOrdered = appointmentsOrdered;

    }



    public int getAppointmentNo() {

        return appointmentNo;

    }



    public void setAppointmentNo(int appointmentNo) {

        this.appointmentNo = appointmentNo;

    }



    public double getAppointmentPrice() {

        return appointmentPrice;

    }



    public void setAppointmentPrice(double appointmentPrice) {

        this.appointmentPrice = appointmentPrice;

    }



    public List<Appointment_type> getAppointmentsOrdered() {

        return appointmentsOrdered;

    }



    public void setAppointmentsOrdered(List<Appointment_type> appointmentsOrdered) {

        this.appointmentsOrdered = appointmentsOrdered;

    }



    @Override

    public String toString() {

        return "\n Appointment number " +

                 + appointmentNo +

                ", priced at: " + appointmentPrice +

                " and having the following procedures done: " + appointmentsOrdered

                ;

    }

>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
}