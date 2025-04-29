public class main {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        doctor d1= new doctor("Bartu",1234,"brain");
        patient p1=new patient("hasan",12345,"12-15-2025","bartu");
        hospital h1=new hospital("liv", 5, 25);
        d1.assign(p1);
        h1.addDoctor(d1);
        h1.addPatient(p1);

        System.out.println(d1.toString());
        System.out.println(p1.toString());
    }
}
