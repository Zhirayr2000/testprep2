package algorithms;

public class ArrayUsage {
    public static void main(String[] args) {
        ArrayHelpers helper = new ArrayHelpers();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10 + 1);
        System.out.print("Generated Array: ");
        helper.print(array);
        helper.InsertionSort(array);
        System.out.print("\nSorted Array: ");
        helper.print(array);
    }
}
