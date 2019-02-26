/**
Adam Epstein
3/3/19
This programs sorts an array using Insertion Sort
 */
public class InsertionSort implements SortingAlgorithm 
{

    public void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                --j; 
            }
            arr[j + 1] = temp;
        }
    }
}