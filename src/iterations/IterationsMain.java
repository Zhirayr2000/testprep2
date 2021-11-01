package iterations;

public class IterationsMain {
    public static void main(String[] args) {
        IterationExercises game = new IterationExercises();
        game.guessingGame();
        System.out.print("Array size: ");
        int n=Integer.parseInt(args[0]);
        System.out.println(n);
        double[] arr1=new double[n];
        long[] arr2=new long[n];
        for(int i=0;i<n;i++){
            arr1[i]=Math.random()*100+1;
            arr2[i]=(long)(Math.random()*10000+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("The sum of odd elements in the given array: "+game.sumOfOdds(arr2));
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("The sum of even elements in the given array: "+game.sumOfEvens(arr1));
        System.out.println();
        System.out.println("Cube of each odd number up until the input number: ");game.cubeOFOdds(n);
    }
}
