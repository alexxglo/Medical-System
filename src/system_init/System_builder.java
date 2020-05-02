package system_init;



import admin_sys_menu.FacilityHelper;

import structure.*;


import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;



public class System_builder extends FacilityHelper {



    @Override

    public Facility buildInitialFacility() {

//        // Appointment types
//
//        String appointment_typeContainings1 = "X-Ray";
//
//        String appointment_typeContainings2 =   "Massage";
//
//        String appointment_typeContainings3 = "Control test";
//
//        String appointment_typeContainings4 = "Knee Surgery";
//
//        String appointment_typeContainings5 = "Lethal injection";
//
//        double appointmentPrice_type1 = 38.00;
//
//        double appointmentPrice_type2 = 60.00;
//
//        double appointmentPrice_type3 = 50.00;
//
//        double appointmentPrice_type4 = 250.00;
//
//        double appointmentPrice_type5 = 100.00;
//
//
//
//        Appointment_type appointment_type1 = new Appointment_type(appointment_typeContainings1,appointmentPrice_type1);
//
//        Appointment_type appointment_type2 = new Appointment_type(appointment_typeContainings2,appointmentPrice_type2);
//
//        Appointment_type appointment_type3 = new Appointment_type(appointment_typeContainings3,appointmentPrice_type3);
//
//        Appointment_type appointment_type4 = new Appointment_type(appointment_typeContainings4,appointmentPrice_type4);
//
//        Appointment_type appointment_type5 = new Appointment_type(appointment_typeContainings5,appointmentPrice_type5);
//
//
//
//        List<Appointment_type> appointment_types = new ArrayList<>();
//
//        appointment_types.add(appointment_type1);
//
//        appointment_types.add(appointment_type2);
//
//        appointment_types.add(appointment_type3);
//
//        appointment_types.add(appointment_type4);
//
//        appointment_types.add(appointment_type5);
//
//
//
//        //Appointments
//
//        Appointment appointment = new Appointment(1,appointmentPrice_type1+appointmentPrice_type2, appointment_type1) ;
//
//        Appointment appointment2 = new Appointment(2,appointmentPrice_type3+appointmentPrice_type4, appointment_type3) ;
//
//        Appointment appointment3 = new Appointment(3,appointmentPrice_type1, appointment_type1) ;
//
//        Appointment appointment4 = new Appointment(4,appointmentPrice_type5, appointment_type5) ;
//
//        Appointment appointment5 = new Appointment(5,appointmentPrice_type2+appointmentPrice_type4, appointment_type2) ;
//
//        List<Appointment> appointments = new ArrayList<>();
//
//        appointments.add(appointment);
//
//        appointments.add(appointment2);
//
//        appointments.add(appointment3);
//
//        appointments.add(appointment4);
//
//        appointments.add(appointment5);
//
//
//
//        //Employee
//
//        Employee employee1 = new Employee("Marica","Ciprian");
//
//        Employee employee2 = new Employee("Hagi","Gheorghe");
//
//        Employee employee3 = new Employee("Dragan","Mihaita");
//
//        Employee employee4 = new Employee("Ibacka","Cabral");
//
//        Employee employee5 = new Employee("Ion","Ion");
//
//        employee1.add_Appointment(appointment);
//
//        employee2.add_Appointment(appointment2);
//
//        employee2.add_Appointment(appointment3);
//
//        employee3.add_Appointment(appointment4);
//
//        employee4.add_Appointment(appointment5);
//
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(employee1);
//
//        employees.add(employee2);
//
//        employees.add(employee3);
//
//        employees.add(employee4);
//
//        employees.add(employee5);
//
//
//        // Cured patients
//
//        CuredPatient human = new CuredPatient("Messi", "Lionel", "dwarfism", "Popa");
//
//        CuredPatient human2 = new CuredPatient("Botezatu", "Catalin", "depression", " Dragan");
//
//        CuredPatient human3 = new CuredPatient("Velea", "Alex", "Abi talent", "Cabral");
//
//        CuredPatient human4 = new CuredPatient("Negru", "Dan", "blonde women", "Hagi");
//
//        CuredPatient cat = new CuredPatient("Tom", "the cat", "fleas", "Popa");
//
//        List<CuredPatient> curedPatients = new ArrayList<>();
//
//        curedPatients.add(human);
//
//        curedPatients.add(human2);
//
//        curedPatients.add(human3);
//
//        curedPatients.add(human4);
//
//        curedPatients.add(cat);
//
//
//        // Current patients
//
//        CurrentPatient patient = new CurrentPatient("Smiran", "Dickson", "malaria", "Dragan");
//
//        CurrentPatient patient2 = new CurrentPatient("Byrd", "Connie", "tetanus infection","Cabral");
//
//        CurrentPatient patient3 = new CurrentPatient("Dudley", "Leonie", "hepatitis D", " Cabral");
//
//        CurrentPatient patient4 = new CurrentPatient("Portillo", "Carina", "COVID-19", "Popa");
//
//        CurrentPatient    dog   = new CurrentPatient("Jerry", "the dog", "Q-Fever", "Popa");
//
//        List<CurrentPatient> currentPatients = new ArrayList<>();
//
//        currentPatients.add(patient);
//
//        currentPatients.add(patient2);
//
//        currentPatients.add(patient3);
//
//        currentPatients.add(patient4);
//
//        currentPatients.add(dog);
//
//        // Diseases we have free medication for
//
//        Medication med1 = new Medication("Celebrex", "Take it by mouth once or twice daily", "Arthritis");
//
//        Medication med2 = new Medication("Lyrica", "Take 2 to 3 times a day without food", "Fibromyalgia");
//
//        Medication med3 = new Medication("Percocet", "Take by mouth","Cancer");
//
//        Medication med4 = new Medication("Atenolol", "1 to 2 times daily", "Hypertension");
//
//        Medication med5 = new Medication("Adderall XR", "daily in the morning", "ADHD");
//
//        List<Medication> diseaseMedication = new ArrayList<>();
//
//        diseaseMedication.add(med1);
//
//        diseaseMedication.add(med2);
//
//        diseaseMedication.add(med3);
//
//        diseaseMedication.add(med4);
//
//        diseaseMedication.add(med5);
//
//        return new Facility(
//
//                "Default Facility",
//
//                "San Francisco, CA",
//
//                employees,
//
//                appointment_types,
//
//                appointments,
//
//                curedPatients,
//
//                currentPatients,
//
//                diseaseMedication)
//        ;

    return null;}

    @Override
    public Facility buildCSVFacility(List<Object> employees, List<Object> appointment_types,
                                     List<Object> appointments, List<Object> currentPatients,
                                     List<Object> diseaseMedication) {


            CuredPatient human = new CuredPatient("Messi", "Lionel", "dwarfism", "Popa");

            CuredPatient human2 = new CuredPatient("Botezatu", "Catalin", "depression", " Dragan");

            CuredPatient human3 = new CuredPatient("Velea", "Alex", "Abi talent", "Cabral");

            CuredPatient human4 = new CuredPatient("Negru", "Dan", "blonde women", "Hagi");

            CuredPatient cat = new CuredPatient("Tom", "the cat", "fleas", "Popa");

            List<CuredPatient> curedPatients = new ArrayList<>();

            curedPatients.add(human);

            curedPatients.add(human2);

            curedPatients.add(human3);

            curedPatients.add(human4);

            curedPatients.add(cat);


            return new Facility(
                    "Default Facility",
                    "San Francisco, CA",

                    employees,
                    appointment_types,
                    appointments,
                    curedPatients,
                    currentPatients,
                    diseaseMedication
            );
        }

    }


