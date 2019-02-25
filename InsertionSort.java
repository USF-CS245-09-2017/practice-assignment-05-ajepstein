/**
Adam Epstein
2/21/19
This programs sorts an array using Insertion Sort
 */
public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp)
            {
                a[j+1] = a[j];
                --j; 
            }
            a[j + 1] = temp;
        }
    }
}
