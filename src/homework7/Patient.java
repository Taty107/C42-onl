package homework7;

public class Patient {
    private String namePatient;
    private Doctor doctor;
    private int treatmentPlan;

    public  Patient (String namePatient, int treatmentPlan) {
        this.namePatient = namePatient;
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

}
