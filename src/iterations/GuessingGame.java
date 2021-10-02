package iterations;

import java.util.Scanner;

public class GuessingGame {
    public void play(){
        int random=(int)(Math.random()*10+1);
        Scanner scanner=new Scanner(System.in);
        boolean userWon=false;
        do{
            System.out.println("Please insert your guess.");
            int guess=scanner.nextInt();
            System.out.println("You inserted: " +guess);
            if(guess==random) {
                System.out.println("You won!");
                userWon=true;
            }
            else{
                System.out.println("Your guess was incorrect,try again.\n");
            }
        }while(!userWon);
    }
}
