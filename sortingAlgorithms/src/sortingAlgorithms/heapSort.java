package sortingAlgorithms;

import java.util.Arrays;

public class heapSort 
{
	private static int hsize;
	
	public static void main(String[] args)
	{
		int[] random = randomIntArray(1000);
		System.out.println(Arrays.toString(random));
		HeapSort(random);
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
	
	public static void HeapSort( int[] A)
	{
		buildMaxHeap(A);
		for(int i = A.length-1 ; i> 0; i--)
		{
			//exchange A[1] with A[i]
			swap(A, 0, i);
			hsize = hsize - 1;
			maxHeapify(A,0);
			
		}
	}
 	
	public static void buildMaxHeap( int[] A)
	{
		hsize = A.length-1;
		for(int i = (hsize/2); i >= 0; i--)
		{
			maxHeapify(A, i);
		}
	}
	
	public static void maxHeapify(int[] A, int i)
	{
		int l = 2*i;
		int r = 2*i+1;
		int max;
		
		if ( l <= hsize && A[l]> A[i])	
			{max = l;}
		else
			{max = i;}
		
		if( r <= hsize && A[r] > A[max])
			{max = r;}
		
		if (max != i)
		{
			swap(A, i, max);
			maxHeapify(A, max);
		}
	}
	
	public static void swap( int[] A, int a, int b)
	{
		int c = A[a];
		A[a] = A[b];
		A[b] = c;
	}
}
