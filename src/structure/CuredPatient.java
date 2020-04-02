package structure;

import java.util.List;

import java.util.ArrayList;

public class CuredPatient extends Patient{

    private List<String> patients_cured = new ArrayList<>();

    public CuredPatient(String patientName, String patientSurname, String illness, String doctor){
        super(patientName, patientSurname, illness, doctor);

    }



    @Override

    public String toString() {

            return "\n Patient " +

                    return_patient_name() +

                    " " + return_patient_surname()  +

                    " has been cured of " + return_illness()  +

                    " by " + return_doctor_name()

                    ;

    }

}

