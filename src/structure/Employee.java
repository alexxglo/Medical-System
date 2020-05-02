<<<<<<< HEAD
package structure;



import admin_sys_menu.Persistable;

import java.io.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.lang.Integer;
import java.lang.Double;

public class Employee implements Persistable {

    private String employeeName;

    private String employeeSurname;

    private List<Appointment> current_appointments_to_have = new ArrayList<>();

    private String path = "C:\\Users\\Aly\\IdeaProjects\\Medical_system\\src\\structure\\employees.csv";

    public Employee() {

        this.employeeName = "";

        this.employeeSurname = "";

        this.current_appointments_to_have = null;
    }

    public Employee(String employeeName, String employeeSurname) {

        this.employeeName = employeeName;

        this.employeeSurname = employeeSurname;


    }



    public void add_Appointment(Appointment appointment) {

        current_appointments_to_have.add(appointment);

        System.out.println("Doctor " + this.employeeName + " " + this.employeeSurname + " has a new appointment: ");

        System.out.println(this.current_appointments_to_have);



    }



    public Employee(String employeeName, String employeeSurname, List<Appointment> current_appointments_to_have) {

        this.employeeName = employeeName;

        this.employeeSurname = employeeSurname;

        this.current_appointments_to_have = current_appointments_to_have;

    }



    public String getEmployeeName() {

        return employeeName;

    }



    public void setEmployeeName(String numeAngajat) {

        this.employeeName = numeAngajat;

    }



    public String getEmployeeSurname() {

        return employeeSurname;

    }



    public void setEmployeeSurname(String prenumeAngajat) {

        this.employeeSurname = prenumeAngajat;

    }



    public List<Appointment> getCurrent_appointments_to_have() {

        return current_appointments_to_have;

    }



    public void setCurrent_appointments_to_have(List<Appointment> current_appointments_to_have) {

        this.current_appointments_to_have = current_appointments_to_have;

    }



    @Override

    public String toString() {

        return "\n Doctor " +

                  employeeName +

                " " + employeeSurname  +

                " has the following appointments \n" + current_appointments_to_have

                ;

    }


    @Override
    public void writeIn(Object x) throws IOException, ClassNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

       bufferedWriter.append("\n");

        bufferedWriter.append(((Employee) x).getEmployeeName());

        bufferedWriter.append(",");

        bufferedWriter.append(((Employee) x).getEmployeeSurname());

        //bufferedWriter.append(",");

        //bufferedWriter.append(((Employee) x).getCurrent_appointments_to_have().toString());

        bufferedWriter.close();
    }

    @Override
    public ArrayList<Object> readFrom() throws IOException, ClassNotFoundException {

        ArrayList<Object> employees = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record;
        record = bufferedReader.readLine();
        while ((record = bufferedReader.readLine()) != null) {

            String[] recordData = record.split(",");
            Employee x = new Employee();
            x.setEmployeeName(recordData[0]);

            x.setEmployeeSurname(recordData[1]);

            List<Appointment> list = new ArrayList<>();

            for (int i = 2; i < recordData.length; i = i + 4) {
                Appointment y = new Appointment();
                y.setAppointmentNo(Integer.parseInt(recordData[i]));
                y.setAppointmentPrice(Double.parseDouble(recordData[i+1]));
                System.out.println(recordData[i+3]);
                y.setAppointmentType(new Appointment_type(recordData[i+2],recordData[i+3]));
                list.add(y);
            }

                x.setCurrent_appointments_to_have(list);

            employees.add(x);
        }

        return employees;
    }

    @Override
    public void writeHeader() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        bufferedWriter.append("Employee name");

        bufferedWriter.append(",");

        bufferedWriter.append("Surname");

        bufferedWriter.append(",");

        bufferedWriter.append("Appointments");

        bufferedWriter.append("\n");

        bufferedWriter.close();
    }
=======
package structure;



import java.util.ArrayList;

import java.util.List;



public class Employee {

    private String employeeName;

    private String employeeSurname;

    private List<Appointment> current_appointments_to_have = new ArrayList<>();



    public Employee(String employeeName, String employeeSurname) {

        this.employeeName = employeeName;

        this.employeeSurname = employeeSurname;

    }



    public void add_Appointment(Appointment appointment) {

        current_appointments_to_have.add(appointment);

        System.out.println("Doctor " + this.employeeName + " " + this.employeeSurname + " has a new appointment: ");

        System.out.println(this.current_appointments_to_have);



    }



    public Employee(String employeeName, String employeeSurname, List<Appointment> current_appointments_to_have) {

        this.employeeName = employeeName;

        this.employeeSurname = employeeSurname;

        this.current_appointments_to_have = current_appointments_to_have;

    }



    public String getEmployeeName() {

        return employeeName;

    }



    public void setEmployeeName(String numeAngajat) {

        this.employeeName = numeAngajat;

    }



    public String getEmployeeSurname() {

        return employeeSurname;

    }



    public void setEmployeeSurname(String prenumeAngajat) {

        this.employeeSurname = prenumeAngajat;

    }



    public List<Appointment> getCurrent_appointments_to_have() {

        return current_appointments_to_have;

    }



    public void setCurrent_appointments_to_have(List<Appointment> current_appointments_to_have) {

        this.current_appointments_to_have = current_appointments_to_have;

    }



    @Override

    public String toString() {

        return "\n Doctor " +

                  employeeName +

                " " + employeeSurname  +

                " has the following appointments \n" + current_appointments_to_have

                ;

    }



>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
}