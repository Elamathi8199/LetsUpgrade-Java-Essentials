import java.util.Scanner;
public class percent {
    public static void main(String[] args){
     int m1,m2,m3,m4,m5;
     float pcent;
     Scanner sc=new Scanner(System.in);
     m1=sc.nextInt();
     m2=sc.nextInt();
     m3=sc.nextInt();
     m4=sc.nextInt();
     m5=sc.nextInt();
     float tot=m1+m2+m3+m4+m5;
     pcent=(tot/500)*100;
     if(m1>=40 && m2>=40 && m3>=40 && m4>=40 && m5>=40){
        if(pcent>=90){
            System.out.println("grade = A , percentage = "+pcent);
         }
         else if(pcent>=80){
            System.out.println("grade = B , percentage = "+pcent);
         }
         else if(pcent>=70){
            System.out.println("grade = C , percentage = "+pcent);
         }
         else if(pcent>=60){
            System.out.println("grade = D , percentage = "+pcent);
         }
         else if(pcent>=50){
            System.out.println("grade = E , percentage = "+pcent);
         }
         else{
             System.out.println("grade= FAIL, percentage= "+pcent);
         }
     }
     else{
        System.out.println("grade= FAIL, percentage= "+pcent);
     }
     

    }
}
