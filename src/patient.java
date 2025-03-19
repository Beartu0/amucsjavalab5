public class patient {
    private String patientName;
    private int patientId;
    private String entryDate;
    private String doctor;
    //main contructor
    public patient(String patientName, int patientId, String entryDate, String doctor){
        this.patientName=patientName;
        this.patientId=patientId;
        this.entryDate=entryDate;
        this.doctor=doctor;
    }
    //copy constructor
    public patient(patient other){
        this.patientName=other.patientName;
        this.patientId=other.patientId;
        this.entryDate=other.entryDate;
        this.doctor=other.doctor;
    }
    //getters
    public String getPatientName() { return this.patientName; }
    public int getPatientID() { return this.patientId;}
    public String getEntryDate() { return this.entryDate; }
    public String getDoctor() { return this.doctor; }

    //setters
    public void setPatientName(String patientname) { this.patientName=patientname; }
    public void setPatientID(int patientId) {  this.patientId=patientId;}
    public void setEntryDate(String entd) {  this.entryDate=entd; }
    public void setDoctor(String doc) {  this.doctor=doc; }

    public String toString(){return("patient name is "+this.patientName+"patient id is "+this.patientId+"entry date is "+this.entryDate+"doctor is "+this.doctor);}
    
    
    public boolean equal(patient other){
        if(this.patientName.equals(other.patientName)&&this.entryDate.equals(other.entryDate)&&this.doctor.equals(other.doctor)&&this.patientId==other.patientId)
            return true;
        else 
            return false;
    }


}




