class Main {
  public static void main(String[] args) {
 
  int [] list = {10,3,5,1,29,15};
 
 sort(list);
 
 for(int e : list)
  System.out.print(e + " ");
  }
  
  private static void sort (int [] list){
    int l = list.length;
    sort(list,0,l);
  }
  
  private static void sort(int [] list, int from, int to){
   
   if(to-from <=1 ){return;}
   
   int pivot = partition(list,from,to);
   
   sort(list, from, pivot);
   sort(list, pivot+1,to);
  }
  
  private static int partition(int [] list, int from, int to){
    
    int pivot = to -1; 
    int store = from;
    
    for (int i = from; i < to; i++){
      if(list[i] < list[pivot])
        swap(list, i, store++);
    }
    swap(list,pivot,store);
    return store;
  }
  
  public static void swap(int [] list, int a, int b){
    
    int tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }  
}
