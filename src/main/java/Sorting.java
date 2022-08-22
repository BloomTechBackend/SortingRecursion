import java.util.Arrays;

public class Sorting
{
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            // EXPLAIN : compare the element with all the other elements while keeping track of the smallest element
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            //  EXPLAIN : swap with the smallest element at the end of the loop
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {29, 72, 98, 13, 87, 66, 52, 51, 36};
        System.out.println(Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
