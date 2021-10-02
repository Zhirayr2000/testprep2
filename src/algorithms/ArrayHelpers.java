package algorithms;

public class ArrayHelpers {
    public static void InsertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public void print(int[] array) {
        System.out.print("[");
        for (int elem: array) {
            System.out.print(elem + ",");
        }
        System.out.print("]");
    }
}
