package admin_sys_menu;



import structure.*;

import java.util.List;

import java.util.ArrayList;

public abstract class FacilityHelper {

    public abstract Facility buildInitialFacility();
    public abstract Facility buildCSVFacility(List<Object> employees,
                                              List<Object> appointment_types,
                                              List<Object> appointments,
                                              List<Object>currentPatients, List<Object>diseaseMedication);

}