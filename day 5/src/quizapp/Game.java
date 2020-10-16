package quizapp;
public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionArray={"Which is the capital of SriLanka?","ICAO stands for?","India has the largest deposits of ___ in the world ?"};
    String[] option1={"Colombo","International Civil Aviation Oganization","gold"};
    String[] option2={"Mannar","Indian Corporation of Agriculture Organization","copper"};
    String[] option3={"Trincomalee","Institute of Company of Accounts Organization","mica"};
    String[] option4={"Ratnapura","None of the above","none of the above"};
    int[] answers={1,1,3};

    public void initGame(){
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++){
            questions[i].question=questionArray[i];
            questions[i].option1=option1[i];
            questions[i].option2=option2[i];
            questions[i].option3=option3[i];
            questions[i].option4=option4[i];
            questions[i].correctAnswer=answers[i];
        }

        // questions[0].question="Which is the capital of SriLanka?";
        // questions[0].option1="Colombo";
        // questions[0].option2="Mannar";
        // questions[0].option3="Trincomalee";
        // questions[0].option4="Ratnapura";
        // questions[0].correctAnswer=1;

        // questions[1].question="ICAO stands for?";
        // questions[1].option1="International Civil Aviation Oganization";
        // questions[1].option2="Indian Corporation of Agriculture Organization";
        // questions[1].option3="Institute of Company of Accounts Organization";
        // questions[1].option4="None of the above";
        // questions[1].correctAnswer=1;

        // questions[2].question="India has the largest deposits of ___ in the world ?";
        // questions[2].option1="gold";
        // questions[2].option2="copper";
        // questions[2].option3="mica";
        // questions[2].option4="none of the above";
        // questions[2].correctAnswer=3;
    }

    public void play(){
        player.playerDetails();
        for(int i=0;i<3;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                player.score=player.score+5;
                System.out.println("Your answer is right");
            }
            else{
                System.out.println("Your answer is wrong");
            }
            System.out.println("");
        }
        System.out.println(player.name+" your score is "+player.score+"/15");
    }
}
