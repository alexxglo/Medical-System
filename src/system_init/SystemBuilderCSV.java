//package system_init;
//
//
//
//import admin_sys_menu.FacilityHelper;
//
//import structure.*;
//
//
//import java.util.ArrayList;
//
//import java.util.Arrays;
//
//import java.util.List;
//
//
//
//public class SystemBuilderCSV extends FacilityHelper {
//
//    @Override
//    public Facility buildCSVFacility(ArrayList<Employee> employees,
//                                     ArrayList<Appointment_type> appointment_types,
//                                     ArrayList<Appointment> appointments,
//                                     ArrayList<CurrentPatient>currentPatients, ArrayList<Medication>diseaseMedication) {
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
//        return new Facility(
//                "Default Facility",
//                "San Francisco, CA",
//
//                employees,
//                appointment_types,
//                appointments,
//                curedPatients,
//                currentPatients,
//                diseaseMedication
//        );
//    }
//
//    @Override
//    public Facility buildInitialFacility() {
//        return null;
//    }
//}