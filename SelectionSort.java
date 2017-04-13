class Main {
  public static void main(String[] args) {
  
  int [] a = {15, 3, 6, 10, 1, 21};
 
  int l = a.length; 
 
  for (int i=0; i < l; i++){
    int lowest = i;
    for (int k = i + 1; k < l; k++){
      if (a[k] < a[lowest])
      lowest = k;
    }
    int tmp = a[lowest];
    a[lowest] = a[i];
    a[i] = tmp;
  }

  for (int e : a)
    System.out.print(e + " ");
  }
}
