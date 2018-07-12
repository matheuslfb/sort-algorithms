import java.util.Random;

public class BubbleSort
{
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    /* Prints the array */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        int start = (int) System.currentTimeMillis();
        BubbleSort ob = new BubbleSort();

        Random n = new Random();

        int arr[] =  new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.nextInt(1000);
        }

        System.out.println(" array");
        //ob.printArray(arr);

        ob.bubbleSort(arr);

        System.out.println("Sorted array");
        //ob.printArray(arr);
        int end  =  (int) System.currentTimeMillis();

        int atual = end - start;
        System.out.println("Tempo em segundos: "+ atual/1000);
    }
}
