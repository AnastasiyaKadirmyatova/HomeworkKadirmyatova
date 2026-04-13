package homework5.task5_1;

public class Therapist {

    Surgeon surgeon = new Surgeon();
    Dentist dentist  = new Dentist();

    public void treat() {
        System.out.println("Терапевт проводит осмотр");
    }

    public void examinationByTherapist(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = "Surgeon";
            surgeon.treat();
        } else {
            if (patient.treatmentPlan == 2) {
                patient.doctor = "Dentist";
                dentist.treat();
            } else {
                patient.doctor = "Therapist";
                treat();
            }
        }
    }
}
