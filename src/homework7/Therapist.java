package homework7;

public class Therapist extends homework7.Doctor {
    private String nameTherapist = "Ivanov G.V.";

    @Override
    public void treatPatient() {
        System.out.println("You are being treated by a therapist " + getName());
    }

    public void appointDoctor(homework7.Patient patient, homework7.Dentist dentist, homework7.Surgeon surgeon, Therapist therapist) {
        System.out.println("The therapist appoints a doctor in accordance with his treatment plan.");
        int plan = patient.getTreatmentPlan();
        if (plan == 1) {
            patient.assignDoctor(surgeon);
            surgeon.treatPatient();
        } else if (plan == 2) {
            patient.assignDoctor(dentist);
            dentist.treatPatient();
        } else {
            patient.assignDoctor(therapist);
            therapist.treatPatient();
        }
    }

    public String getName() {
        return nameTherapist;
    }
}
