import java.util.Scanner;
public class empTax {
    public static void main(String[] args){
    String name;
    short date, month;
    int year, mon_salary;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the name, date, month, year of birth, monthly salary");
    name=sc.nextLine();
    date=sc.nextShort();
    month=sc.nextShort();
    year=sc.nextInt();
    mon_salary=sc.nextInt();
    
    short cDate=10, cMonth=10;
    int cYear=2020;
    int age,tax;

    if(month<=cMonth && date<=cDate){
        age=cYear-year;
    }
    else{
        age=cYear-year-1;
    }

    int annual_sal=mon_salary*12;
    if(annual_sal>=500000){
        tax=annual_sal*20/100;
    }
    else if(annual_sal>=400000){
        tax=annual_sal*15/100;
    }
    else if(annual_sal>=300000){
        tax=annual_sal*10/100;
    }
    else if(annual_sal>=200000){
        tax=annual_sal*5/100;
    }
    else{
        tax=0;
    }
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Annual salary: "+annual_sal);
    System.out.println("Tax: "+tax);

    }
}
