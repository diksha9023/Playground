import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
       int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
         arr[i]=scan.nextInt();
      }
      move_zero(n,arr);
    }
  public static void move_zero(int n,int arr[])
  {
    for(int i=0;i<=n-1;i++)
    {
      if(arr[i]!=0)
        System.out.print(arr[i]+" ");
    }
    for(int i=0;i<=n-1;i++)
    {
      if(arr[i]==0)
        System.out.print(arr[i]+" ");
    }
    
    
    
    }
}