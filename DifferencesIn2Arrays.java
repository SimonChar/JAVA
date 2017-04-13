import java.util.*;

class Main {
  public static void main(String[] args) {
   
  int [] A = {1, 3, 6, 10, 15, 21};
  int [] B = {1, 3, 5, 7, 8, 9};
  
  int [] C = linearDiff(A,B);
  int [] C2 = naiveDiff(A,B);
  
  for (int e : C)
    System.out.print(e + " ");
    
  for (int e : C2)
    System.out.print(e + " ");
    
  }
  
  
  public static int [] linearDiff(int A [], int B []){

      int [] tmp = new int [A.length]; 
      int ib = 0, ic = 0;
    
      for (int a: A){
        while ( ib < B.length && B[ib] < a){
            ib++;
          }
          if(!(ib < B.length && a == B[ib])){
            tmp[ic++]=a;
          }
          
        }
        return Arrays.copyOf(tmp,ic);
      }
      
  public static int [] naiveDiff(int A[], int B []){
    
    int [] tmp = new int [A.length];
    int ic = 0;
    boolean flag;
    
    for (int a : A){
      flag = false;
      for ( int b : B){
        if (a == b)
          flag = true;
      }
      if (flag == false)
        tmp[ic++] = a;
    }
    return Arrays.copyOf(tmp,ic);
    }
   
   }
