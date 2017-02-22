/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[] list = new int[]{9,8,7,6,5,4,3,2,1};
		int len =list.length;
		int count =0;
		
		for(int i=1; i<len; i++)
		{
			int key = list[i];		 //5
			int piv = i -1;   		 //0
			
			count+=1;
				while(piv >=0 && list[piv] > key)
				{
					list[piv+1] = list[piv];
					piv-=1;
					count+=1;
					
				}
				
				list[piv+1]=key;
				
			
		}
		
		
		
		
		for(int i =0; i < len;i++)
		{
			System.out.print(list[i]+", ");
		}
		
		System.out.println("count: "+ count);
		
		
		
	}
}
