public class LonSub {

	public static void main(String[] args) {
	
	//Declare and initialise an array with integers
		int [] numbers = {1,2,3,4,7,8,9,10,11};
		int maxLength= numbers.length;
		int indexS = 0;
		int indexE = 0;
		int subSeqLength = 1;
		int longest = 1;
		
		for(int x = 0; x < maxLength - 1; x++)
		{			
//check if the current integer is the same as the next then we increment   //the subSequence counter
			if(numbers[x] == numbers[x+1]-1)	
			{
				subSeqLength++;		
				// we need to reassign the new indexes
				if(subSeqLength > longest)
				{
					longest = subSeqLength;
					indexS = x + 2 - subSeqLength;
					indexE = x + 2;
				}				
			}
			else
				subSeqLength = 1;
		}
		
//I have assumed that I have decided to place in a different array instead //of swapping within the array
		int revArr [] = new int [indexE-indexS];
		int revInd = 0;
		
		//store the sequence in a new array in a reverse order
		for (int i = indexE-1 ; i >= indexS ; i--)
		{
			revArr[revInd++] = numbers[i];
		}
		for (int x : revArr)
			System.out.println(x);
	}
