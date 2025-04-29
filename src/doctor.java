public class doctor {
    private String doctorName;
    private int doctorID;
    private String specialization;
    private patient[] patients;
    private int noOfPatients;
    private boolean isAvailable;

    public doctor(String doctorName,int doctorID,String specialization){
        this.patients=new patient[4];
        this.doctorName=doctorName;
        this.doctorID=doctorID;
        this.specialization=specialization;
        this.noOfPatients=0;
        this.isAvailable=true;
    }
    public doctor(doctor other){
        this.doctorName=other.doctorName;
        this.doctorID=other.doctorID;
        this.specialization=other.specialization;
        this.noOfPatients=other.noOfPatients;
        this.isAvailable=other.isAvailable;
        this.patients= new patient[4];
        for(int i=0;i<4;i++){
            this.patients[i]=new patient(other.patients[i]);
        }
    }
    //getters
    public String getdoctorname(){return this.doctorName;}
    public int getdoctorid(){return this.doctorID;}
    public String getspecialization(){return this.specialization;}
    public int getnofpatient(){return this.noOfPatients;}
    public boolean getavilable(){return this.isAvailable;}
    //setters
    public void setdoctorname(String docname){this.doctorName=docname;}
    public void setdoctorid(int docid){this.doctorID=docid;}
    public void setspecialization(String spec){this.specialization=spec;}
    
    public void assign(patient pat){
        if(noOfPatients<4){
            this.patients[noOfPatients] = new patient(pat);
            noOfPatients++;
            System.out.println("paitent assigned succesfully");
            if(noOfPatients==4){isAvailable=false;}
        else{System.out.println("this doctor is full");}
        }
    }

    public String toString(){return("doctor name is "+this.doctorName+" doctor id is "+this.doctorID+" avilability "+isAvailable+"specializition is"+this.specialization);
    }
    public boolean equals(doctor other){
        if(this.doctorName.equals(other.doctorName)&&this.doctorID==other.doctorID&&this.noOfPatients==other.noOfPatients)
            return true;
        else 
            return false;
    }

    
}
