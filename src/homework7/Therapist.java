package homework7;

public class Therapist extends Doctor {
    private String nameTherapist = "Ivanov G.V.";

    @Override
    public void treatPatient() {
        System.out.println("You are being treated by a therapist" + getName());
    }

    public void appointDoctor(Patient patient, Dentist dentist, Surgeon surgeon) {
        System.out.println("The therapist appoints a doctor in accordance with his treatment plan.");
        int plan = patient.getTreatmentPlan();
        if (plan == 1) {
            patient.assignDoctor(surgeon);
        } else if (plan == 2) {
            patient.assignDoctor(dentist);
        } else {
            patient.assignDoctor(this);
        }
    }

    public String getName() {
        return nameTherapist;
    }
}
