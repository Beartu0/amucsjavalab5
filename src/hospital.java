public class hospital {
    private String hospitalname;
    private int numberofdoc;
    private int numberofpat;
    private doctor[] doctors;
    private patient[] patients;
    private int sizeofdocs;
    private int sizeofpat;


    public hospital(String hospitalname,int sizeofdocs,int sizeofpat){        
        this.hospitalname=hospitalname;
        this.sizeofdocs=sizeofdocs;
        this.sizeofpat=sizeofpat;
        this.patients=new patient[sizeofpat];
        this.doctors=new doctor[sizeofdocs];
        this.numberofdoc=0;
        this.numberofpat=0;
    }
    public void addDoctor(doctor doc){
        if (numberofdoc < sizeofdocs) {
            doctors[numberofdoc] = new doctor(doc);
            numberofdoc++;
            System.out.println("Doctor added");
        } else {
            System.out.println("Cannot add more doctors");
        }
    }
    public void addPatient(patient pat){
        if (numberofpat < sizeofpat) {
            patients[numberofpat] = new patient(pat);
            numberofpat++;
            System.out.println("patient added");
        } else {
            System.out.println("Cannot add more patients");
        }
    }
    public doctor findDoctor(int doctorID) {
        for (int i = 0; i < numberofdoc; i++) {
            if (doctorID==doctors[i].getdoctorid()) {
                return doctors[i];
            }
        }
                return null;
    }
    public patient findPatient(int patientId) {
        for (int i = 0; i < numberofpat; i++) {
            if (patientId==patients[i].getPatientID()) {
                return patients[i];
            }
        }
                return null;
    }
    public void assignDoctorToPatient(int patientID, int doctorID){
        patient tmpPatient=findPatient(patientID);
        doctor tmpDoctor=findDoctor(doctorID);
        tmpDoctor.assign(tmpPatient);
    }



    public void removePatient(int patientID) {
        for (int i = 0; i < numberofpat; i++) {
            if (patients[i].getPatientID()==patientID) {
                System.out.println("Removing patient: " );
                for (int j = i; j < numberofpat - 1; j++) {
                    patients[j] = patients[j - 1];
                }
                patients[numberofpat - 1] = null;
                numberofpat--;
                return;
            }
        }
        System.out.println("err");
    }

}