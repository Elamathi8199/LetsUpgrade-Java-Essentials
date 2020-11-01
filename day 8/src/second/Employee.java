package second;
import java.util.Scanner;

public class Employee {
    String name;
    int age;
    double salary;
    String designation;
    
    Scanner sc=new Scanner(System.in);

    public void getDetails(){
        System.out.println("Enter employee name, age, salary, designation");
        name=sc.next();
        age=sc.nextInt();
        salary=sc.nextDouble();
        designation=sc.next();
    } 


    public void displayDetails(){
        System.out.println("Name is " +name+", age is "+age+", salary is "+salary+", and designation is "+designation); 
    }
}
