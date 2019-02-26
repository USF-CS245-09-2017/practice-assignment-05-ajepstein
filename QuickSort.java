/**
Adam Epstein
3/3/19
This programs sorts an array using Quick Sort
 */
public class QuickSort implements SortingAlgorithm 
{
    public void quicksort (int [] arr, int left, int right) 
    {
        if (left < right) 
        {
            int p = partition(arr, left, right);
            quicksort(arr, left, p - 1);
            quicksort(arr, p + 1, right);
        }
    }

    public int partition (int [] arr, int left, int right) 
    {
        if (left < right) 
        {
            int pivot = left;
            int i = left + 1; // Avoids re-sorting the pivot
            int j = right;
            while (i < j) 
            {
                while (i <= right && arr[i] <= arr[pivot]) 
                {
                    ++i;                    
                }
                
                while (j >= i && arr[j] > arr[pivot]) 
                {
                    --j;
                }
                
                if (i <= right && i < j) 
                {
                    swap(arr, i, j);
                }
            }
            swap(arr, pivot, j);  // pivot to the middle
            return j;
        }
        return left;
    }

    public void sort (int [] arr) 
    {
        quicksort(arr, 0, arr.length - 1);
    }

     private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}    