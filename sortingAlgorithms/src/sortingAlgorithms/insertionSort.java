package sortingAlgorithms;

import java.util.Arrays;

public class insertionSort 
{
	public static void main(String[] args)
	{
		int[] random = randomIntArray(100);
		System.out.println(Arrays.toString(random));
		insertion(random);
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
	
	public static int[] insertion(int[] a)
	{
		int arrayBookMark;
		for(int j = 1; j < a.length; j++)
		{
			arrayBookMark = a[j];
			int i = j - 1;
			while (i >= 0 && a[i] > arrayBookMark)
			{
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = arrayBookMark;
		}
		
		
		return a;
		
	}
	
}
