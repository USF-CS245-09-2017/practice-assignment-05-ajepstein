/**
Adam Epstein
3/3/19
This programs sorts an array using Merge Sort
 */

import java.util.Arrays;

public class MergeSort implements SortingAlgorithm 
{
	public void sort(int[] arr) 
	{
		if(arr.length > 1)
		{
			int[] left = get_left(arr);
			int[] right = get_right(arr);
			sort(left);
			sort(right);
			merge(left, right, arr);
		}
	}

	public void merge(int [] left, int [] right, int [] arr) 
	{
		int left_index = 0;
		int right_index = 0;
		int target_index = 0;

		while(left_index < left.length && right_index < right.length) 
		{
			if(left[left_index] <= right[right_index])
			{
				arr[target_index++] = left[left_index++];
			}
			
			else
			{
				arr[target_index++] = right[right_index++];
			}
		}
				
		while (left_index < left.length) 
		{
			arr[target_index++] = left[left_index++];
		}

		while (right_index < right.length) 
		{
			arr[target_index++] = right[right_index++];
		}	
	}

	public int[] get_left(int[] arr)
	{
		int mid = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		return left;
	}

	public int[] get_right(int[] arr)
	{
		int mid = arr.length / 2;
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		return right;
	}		
}	
	


