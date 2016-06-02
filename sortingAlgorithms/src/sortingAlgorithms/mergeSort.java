package sortingAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class mergeSort 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] random = randomIntArray(100);
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
	
	public static void mergesort(int[] A, int[] temp,int p,int r)
	{
		if(p<r)
		{
			int q = (p+r)/2;
			mergesort(A,temp,p,q);
			mergesort(A,temp,q+1,r);
			merge(A,temp,p,q,r);
		}
	}
	
	public static void merge(int[] A, int[] temp, int p, int q, int r)
	{
		int i = p;
		int j = q+1;
		for( int k = p; k <= r; k++)
		{
			temp[k] = A[k];
		}
		for( int k = p; k <= r; k++)
		{
			if(i>q)//left half empty,copy from right
			{
				A[k]=temp[j];
				j++;
			}
			else if(j>r)//right half empty, copy from left
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


