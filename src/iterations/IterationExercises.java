package iterations;

import java.util.Scanner;

public class IterationExercises {
    public long sumOfOdds(long[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]%2==1?arr[i]:0;
        }
        return sum;
    }
    public double sumOfEvens(double[] arr){
        double sum=0;
        for(double i:arr){
            sum+=(long)i%2==0?i:0;
        }
        return sum;
    }
    public void cubeOFOdds(int number){
        int i=1;
        while(i<=number){
            System.out.print(i*i*i+" ");
            i+=2;
        }
    }
    public void guessingGame() {
        int random = (int) (Math.random() * 10 + 1);
        Scanner scanner = new Scanner(System.in);
        boolean userWon = false;
        do {
            System.out.println("Please insert your guess.");
            int guess = scanner.nextInt();
            System.out.println("You inserted: " + guess);
            if (guess == random) {
                System.out.println("You won!");
                userWon = true;
            } else {
                System.out.println("Your guess was incorrect,try again.\n");
            }
        } while (!userWon);
    }
}
