package quizapp;
import java.util.Scanner;

public class Player {
    String name;
    int score=0;
    Scanner sc=new Scanner(System.in);
    public void playerDetails(){
        System.out.println("Enter your name");
        name=sc.next();
    }
}
