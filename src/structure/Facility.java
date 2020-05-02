package structure;



import admin_sys_menu.commands;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Facility implements commands {



    private String facility_name;

    private String facility_location;

    private List<Object> employees = new ArrayList<>();

    private List<Object> appointment_types = new ArrayList<>();

    private List<Object> appointments = new ArrayList<>();

    private List<CuredPatient> cured_patients = new ArrayList<>();

    private List<Object> currentPatients = new ArrayList<>();

    private List<Object> diseaseMedication = new ArrayList<>();


    public Facility(String facility_name, String facility_location) {

        this.facility_name = facility_name;

        this.facility_location = facility_location;

    }



    public Facility(String facility_name, String facility_location, List<Object> employees, List<Object> appointment_types,
                    List<Object> appointments, List<CuredPatient>cured_patients, List<Object>currentPatients, List<Object>diseaseMedication) {

        this.facility_name = facility_name;

        this.facility_location = facility_location;

        this.employees = employees;

        this.appointment_types = appointment_types;

        this.appointments = appointments;

        this.cured_patients = cured_patients;

        this.currentPatients = currentPatients;

        this.diseaseMedication = diseaseMedication;

    }



    public String getFacility_name() {

        return facility_name;

    }



    public void setFacility_name(String facility_name) {

        this.facility_name = facility_name;

    }



    public String getFacility_location() {

        return facility_location;

    }



    public void setFacility_location(String facility_location) {

        this.facility_location = facility_location;

    }



    public List<Object> getEmployees() {

        return employees;
    }



    public void setEmployees(List<Object> employees) {

        this.employees = employees;

    }


    public List<Object> getAppointment_types() {

        return appointment_types;

    }



    public void setAppointment_types(List<Object> appointment_types) {

        this.appointment_types = appointment_types;

    }



    public List<Object> getAppointments() {

        return appointments;

    }



    public void setAppointments(List<Object> appointments) {

        this.appointments = appointments;

    }


    public List<CuredPatient> getCuredPatients() {

        return cured_patients;

    }

    public List<CuredPatient> getCuredPatientsAlphabetically() {

        Collections.sort(cured_patients, new Comparator<CuredPatient>() {
            @Override
            public int compare(CuredPatient o1, CuredPatient o2) {
                return o1.return_patient_name().compareTo(o2.return_patient_name());
            }
        });
        return cured_patients;
    }


    public int return_CuredPatients(){
        return cured_patients.size();
    }

    public int return_CurrentPatients(){
        return currentPatients.size();
    }

    public int evaluatePatients(){
        int evaluation = return_CuredPatients() + return_CurrentPatients();
        return evaluation;
    }


    public List<Object> getCurrentPatients() {

        return currentPatients;

    }

    public List<Object> getCurrentPatientsAlphabetically() {

        Collections.sort(currentPatients, new Comparator<Object>() {

            @Override

            public int compare(Object o1, Object o2) {
                return ((CurrentPatient) o1).return_patient_name().compareTo(((CurrentPatient)o2).return_patient_name());
            }
        });
        return currentPatients;
    }


    public List<Object> getMedicationAlphabetically() {

        Collections.sort(diseaseMedication, new Comparator<Object>() {

            @Override

            public int compare(Object o1, Object o2) {
                return ((Medication)o1).return_disease().compareTo(((Medication) o2).return_disease());
            }
        });
        return diseaseMedication;
    }



    public void setCuredPatients(List<CuredPatient>cured_patients) {

        this.cured_patients = cured_patients;

    }

    //public int evaluation_curedPatients()
    @Override

    public void add_employee(Employee employees) {

        this.employees.add(employees);

        System.out.println("We have added to the facility the following doctor: ");

        System.out.println(employees);

    }



    @Override

    public void delete_employee(int index) {

        this.employees.remove(index);

        System.out.println("We have deleted from database doctor no. : "+ index);

    }



    @Override

    public void add_appointment(Appointment appointment) {

        this.appointments.add(appointment);

        System.out.println("New appointment: ");

        System.out.println(appointment);

    }

    @Override

    public void add_curedPatient(CuredPatient curedpatient){

        this.cured_patients.add(curedpatient);
        System.out.println("New cured patient: ");
        System.out.println(curedpatient);
    }

    @Override

    public void add_currentPatient(CurrentPatient curentPatient){

        this.currentPatients.add(curentPatient);
        System.out.println("New current patient: ");
        System.out.println(curentPatient);
    }



    public void add_appointmentType(Appointment_type type) {

        this.appointment_types.add(type);

        System.out.println("New appointment type: ");

        System.out.println(type);

    }



}