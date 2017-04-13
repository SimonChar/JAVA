public static int[] answer(int[] data, int n) { 

        // Your code goes here.
    if (data.length > 100) 
        System.out.println("please insert a list of less than 100");
    
    int ele = data.length;
    int [] res = new int [ele];
    
  Map<Integer, Integer> num = new HashMap<Integer, Integer>();

	for (Integer temp : data)
	{
		Integer count = num.get(temp);
		num.put(temp, (count == null) ? 1 : count + 1);
	}

	Iterator<Integer> it = num.keySet().iterator();

	while (it.hasNext())
	{
	  Integer key = (Integer) it.next();
	  Integer value = num.get(key);
	  if (value >= n)
    	it.remove();
 	}
	 return res;
    } 
}
