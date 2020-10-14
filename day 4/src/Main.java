import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    // ANS 1:
        Avenger[] avengers=new Avenger[5];

        // creating objects and getDetails
        for(int itr=0;itr<5;itr++){
            avengers[itr]=new Avenger();
            avengers[itr].getDetails();
        }

        // displayDetails
        for(int itr=0;itr<5;itr++){
            avengers[itr].displayDetails();
        }
    
    // ANS 2:
        int[] arr=new int[]{23,24,25,26,27};
    
        for(int i=0; i<5 ; i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
            }
        }
    
    // ANS 3:
        int[] val=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 array values");
        int sum=0;
        for(int i=0; i<5 ; i++){
            val[i]=sc.nextInt();
            sum=sum+val[i];
        }
        System.out.println("Sum of the array value is "+sum);
        sc.close();

    }
}
