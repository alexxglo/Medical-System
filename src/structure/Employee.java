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



}