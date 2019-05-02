import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
     int n= scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=scan.nextInt();
      
    }
   batch(n,arr);
  }
    public static void batch(int n,int arr[])
    {
      boolean is_match=false;
      int crr_batch=0;
    int batch_sum=arr[0]+arr[1]+arr[2];
      for(int i=3;i<=n-1;i=i+3)
      {
        crr_batch=arr[i]+arr[i+1]+arr[i+2];
      }
      if(batch_sum==crr_batch)
      {
        is_match=true;
      }
      if(is_match==true)
        System.out.println("Perfect Batch");
      else
        System.out.println("Not a Perfect Batch");
    }
  
}