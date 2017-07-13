public class Pair {

    public static void main(String[] args) {

//This can be done in a naive way which would result in a O(N^2) time complexity
//Since the arrays are sorted I will sum the minindex of array1 and 
//the maxindex of array2 in order to compare to the sum, which will result to a O(N) complexity
		
    int array1 [] = {1,3,4,6,8};
    int array2 [] = {5,6,7,10,12};
    int sum = 13;
    int minIndexArray1 = 0;
    int maxIndexArray2 = array2.length -1;
		
        while(minIndexArray1 < array1.length && maxIndexArray2 >= 0)
	    {
	    int elementsSum = array1[minIndexArray1] + array2[maxIndexArray2];
				
		    if(elementsSum == sum)
		    {
		        System.out.println( minIndexArray1 + ", " + maxIndexArray2);
		        minIndexArray1++;
		    }
				
		    else if(elementsSum > sum)
			    maxIndexArray2--;
				
		    else
		        minIndexArray1++;
	    }
    }
}
