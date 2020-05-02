<<<<<<< HEAD
package admin_sys_menu;



        import structure.Employee;

        import structure.Appointment;

        import structure.Appointment_type;

        import structure.CuredPatient;

        import structure.CurrentPatient;

public interface commands {

    void add_employee(Employee employee);

    void delete_employee(int index);

    void add_appointment(Appointment appointment);

    void add_appointmentType(Appointment_type appointment_type);

    void add_curedPatient(CuredPatient curedpatient);

    void add_currentPatient(CurrentPatient currentPatient);


=======
package admin_sys_menu;



import structure.Employee;

import structure.Appointment;

import structure.Appointment_type;

import structure.CuredPatient;

import structure.CurrentPatient;

public interface commands {

    void add_employee(Employee employee);

    void delete_employee(int index);

    void add_appointment(Appointment appointment);

    void add_appointmentType(Appointment_type appointment_type);

    void add_curedPatient(CuredPatient curedpatient);

    void add_currentPatient(CurrentPatient currentPatient);


>>>>>>> db828be700060fdd2e88c7d3ebcb395d5f60525e
}