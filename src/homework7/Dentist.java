package homework7;

public class Dentist extends homework7.Doctor {

    private String nameDentist = "Korotkova D.A.";

    @Override
    public void treatPatient() {
        System.out.println("You are being treated by a dentist " + getName());
    }

    public String getName() {
        return nameDentist;
    }
}
