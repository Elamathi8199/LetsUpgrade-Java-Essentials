package second;

public class Main {
    public static void main(String[] args) throws Exception {
        Doctor[] doctor=new Doctor[3];
       for(int i=0;i<3;i++){
        System.out.println("Enter doctor details");
        doctor[i]=new Doctor();
        doctor[i].getDetails();
        doctor[i].setHospitalName();
        doctor[i].displayDetails();
        doctor[i].getHospitalName();
       }

       Engineer[] engineer=new Engineer[3];
       for(int i=0;i<3;i++){
        System.out.println("Enter engineer details");
        engineer[i]=new Engineer();
        engineer[i].getDetails();
        engineer[i].setEngineerId();
        engineer[i].displayDetails();
        engineer[i].getEngineerId();
       }

       Pilot[] pilot=new Pilot[3];
       for(int i=0;i<3;i++){
        System.out.println("Enter pilot details");
        pilot[i]=new Pilot();
        pilot[i].getDetails();
        pilot[i].setPilotId();
        pilot[i].displayDetails();
        pilot[i].getPilotId();
       }
    }
}
