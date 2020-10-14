import java.util.Scanner;

public class Avenger {
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;
    
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter avenger name");
        name=sc.next();
        System.out.println("Enter avenger age");
        age=sc.nextInt();
        System.out.println("Enter avenger power");
        power=sc.next();
        System.out.println("Enter avenger weapon");
        weapon=sc.next();
        System.out.println("Enter avenger planet");
        planet=sc.next();
    }

    public void displayDetails(){
        System.out.println("Avenger name is "+name);
        System.out.println("Avenger age is "+age);
        System.out.println("Avenger power is "+power);
        System.out.println("Avenger weapon is "+weapon);
        System.out.println("Avenger planet is "+planet);
        System.out.println(" ");
    }

}
