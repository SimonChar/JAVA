/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//unsorted array
		int[] list = new int[]{1,2,3,9,7,4,5,6,10,122,22,43,23,44,98,90};
		
		
		//call merge sort
	mergeSort(list);
	printList(list);
	}
	
	public static int[] mergeSort(int[] list)
	{
		//iflist isempty there is no need to do anything 
		if(list.length <=1)
		{
			return list;
			}
			
		//Split the array in half
		int[] first = new int[list.length/2];
		int[] second = new int[list.length - first.length];
		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);
		
		//Sort each halfrecursively
		mergeSort(first);
		mergeSort(second);
		
		//Merge both halves together, overwriting to original array
		
		merge(first, second, list);
		return list;
	}
	
	public static void merge(int[] first, int[] second, int[] result)
	{
		
		//index position infirst array - starting with first element
		int iFirst =0;
		
			//index position insecond array - starting with first element
		int iSecond =0;
		
			//index position infirst array - starting with first position
		int iMerged =0;
		
		//Compare elements at iFirst and iSecond, and move smaller element at iMerged
		
		while(iFirst < first.length && iSecond < second.length)
		{
		
		if(first[iFirst] < second[iSecond])
				{
					result[iMerged] = first[iFirst];
					iFirst++;
				}
				
		else
		
				{
					
					result[iMerged] = second[iSecond];
					iSecond++;
				}
		iMerged++;
		
		
		}
		
		
		//copy remaining elements from both halves - each half will havealready sorted elements
		
		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
		
		
	}
	public static void printList(int[] list)
	{
		for(int i =0; i < list.length; i++)
		{
			System.out.print(list[i] + ", ");
			}
			
	}
	
	
	
	
	
	
	
}
