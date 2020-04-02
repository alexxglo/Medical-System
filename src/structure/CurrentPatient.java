package structure;

import java.util.List;

import java.util.ArrayList;

public class CurrentPatient extends Patient{


    private List<String> current_patients = new ArrayList<>();

    public CurrentPatient(String patientName, String patientSurname, String illness, String doctor){

        super(patientName, patientSurname, illness, doctor);
    }

    public int return_number_of_patients(){

        return current_patients.size();

    }

    @Override

    public String toString() {

        return "\n Patient " +

               return_patient_name() +

                " " + return_patient_surname()  +

                " suffers from " + return_illness()  +

                " and is being cured by " + return_doctor_name()

                ;

    }

}

