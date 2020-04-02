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

}