/*
 * I can write a comment like this. Here is the first hellow world program
 */

import java.util.*;
import java.util.ArrayList;

class Distinct{
	
	
	public static void main(String []args){
		
		System.out.println("Please input a list of numbers");
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		while (input.hasNextInt()){
		
			list.add(input.nextInt());
		}
			input.close();
		
		Integer[] arr = list.toArray(new Integer[list.size()]);
		
		System.out.println(distinct(arr));
		
		if(distinct(arr))
			System.out.println("No duplicates");
		
		else
			System.out.println("There are duplicates");
			
	}
	
	public static boolean distinct(Integer [] list){
	
	for (int j =0; j <list.length; j++)
		for (int k = j+1; k<list.length; k++)
			if (k!=j && list[k] == list[j])
				return false;
			
	return true;
	}
	
}