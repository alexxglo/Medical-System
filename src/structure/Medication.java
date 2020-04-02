package structure;

public class Medication {

    private String medicationName;
    private String instructions;
    private String disease;

    public Medication(String medicationName, String instructions, String disease){

        this.medicationName = medicationName;

        this.instructions = instructions;

        this.disease = disease;
    }

    public String return_medicationName(){

        return medicationName;

    }

    public String return_instructions(){

        return instructions;

    }

    public String return_disease(){

        return disease;
    }

    @Override

    public String toString(){

        return "\n Medication name: "  +  medicationName  +
                " Instructions: "  + instructions  +
                " Disease: "  + disease;
    }
}
