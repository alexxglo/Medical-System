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

}