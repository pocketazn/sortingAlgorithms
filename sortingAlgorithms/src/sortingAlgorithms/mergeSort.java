package sortingAlgorithms;

import java.util.Arrays;

public class mergeSort 
{
	public static void main(String[] args) 
	{
		int[] random = randomIntArray(10);
		int[] temp = new int[1000];
		System.out.println(Arrays.toString(random));
		mergesort(random, temp,0, random.length - 1);
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
	
	public static void mergesort(int[] A, int[] temp,int low,int high)
	{
		if(low<high)
		{
			int middle = (low + high)/2;
			mergesort(A,temp,low,middle);
			mergesort(A,temp,middle+1,high);
			merge(A,temp,low,middle,high);
		}
	}
	
	public static void merge(int[] A, int[] temp, int low, int middle, int high)
	{
		int i = low;
		int j = middle+1;
		for( int k = low; k <= high; k++)
		{
			temp[k] = A[k];
		}
		for( int k = low; k <= high; k++)
		{
			if(i>middle)//left half empty,copy from right
			{
				A[k]=temp[j];
				j++;
			}
			else if(j>high)//right half empty, copy from left
			{
				A[k] = temp[i];
				i++;
			}
			else if(temp[j]<temp[i])//copy from right
			{
				A[k]= temp[j];
				j++;
			}
			else // copy from left
			{
				A[k] = temp[i];
				i++;
			}
			
		}
		
		 
	}
}


