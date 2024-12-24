class Fortis {
    public static void main(String[] fort) {
        Patient patient = new Patient();
        patient.setPatientId(501);
        patient.setPatientName("Sophie Johnson");
        patient.setDiagnosis("Hypertension");

        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Diagnosis: " + patient.getDiagnosis());
    }
}