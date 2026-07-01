package homework7;

public class MyMain {
    public static void main(String[] args) {
        createMyHospital();
    }

    public static void createMyHospital(){
        Therapist therapist = new Therapist();
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Patient patient = new Patient("Artyom Prokofiev", 1);
        System.out.println(patient);
        therapist.appointDoctor(patient, dentist, surgeon,therapist);
        System.out.println("*".repeat(100));
        Patient hardPatient = new Patient("Karolina Evgenievna", 2);
        System.out.println(hardPatient);
        therapist.appointDoctor(hardPatient, dentist, surgeon, therapist);
        System.out.println("*".repeat(100));
        Patient usuPatient = new Patient("Anton Alexandrovich", 3);
        System.out.println(usuPatient);
        therapist.appointDoctor(usuPatient, dentist, surgeon, therapist);


    }
}
