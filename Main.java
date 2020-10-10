public class Main {
    public static void main(String[] args)  {
        employee e1=new employee();
        e1.name="Mathi";
        e1.age=21;
        e1.city="Chennai";
        System.out.println("Employee 1:");
        e1.display();
        
        employee e2=new employee();
        e2.name="Priya";
        e2.age=21;
        e2.city="Mumbai";
        System.out.println("Employee 2:");
        e2.display();
    }
}
