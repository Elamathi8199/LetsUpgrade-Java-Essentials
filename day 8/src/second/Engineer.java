package second;
import java.util.Scanner;

public class Engineer extends Employee{
    
    private long engineerId;
    Scanner sc=new Scanner(System.in);

    public void setEngineerId(){
        System.out.println("Enter engineer Id");
        engineerId=sc.nextLong();
    }
    public void getEngineerId(){
        System.out.println("Engineer Id is "+engineerId);
    }
    
}
