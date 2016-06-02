package sortingAlgorithms;

import java.util.Arrays;

public class selectionSort 
{
	public static void main(String[] args)
	{
		int[] random = randomIntArray(200000);
		System.out.println(Arrays.toString(random));
		selectSort(random);
		System.out.println(Arrays.toString(random));
		
	}
	
	public static int[] randomIntArray(int size)
	{
		int[] random = new int[size];
		for(int i = 0; i < random.length; i++)
		{
			random[i] =(int) (Math.random()*100);
		}
		return random;
	}
	
	public static void selectSort(int[] A)
	{
		for (int i = 0; i <= A.length-1; i++)
		{
			int min = findmin(A, i, A.length-1);
			swap(A, i, min);
		}
	}
	
	private static int findmin(int[] A, int low, int high)
	{
		int min = low;
		for(int i = low; i <= high; i++)
		{
			if(A[min] > A[i])
			{
				min = i;
			}
		}
		return min;
		
	}
	
	private static void swap( int[] A, int a, int b)
	{
		int c = A[a];
		A[a] = A[b];
		A[b] = c;
	}
}
