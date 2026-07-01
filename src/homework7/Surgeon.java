package homework7;

public class Surgeon extends homework7.Doctor {

    private String nameSurgeon = "Petrov A.A.";

    @Override
    public void treatPatient() {
        System.out.println("You are being treated by a surgeon " + getName());
    }

    public String getName() {
        return nameSurgeon;
    }
}
