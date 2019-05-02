import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner scan=new Scanner(System.in);
      int n= scan.nextInt();
      int k=scan.nextInt();
      int arr[]= new int[n];
     int freq[]=new int[k];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=scan.nextInt();
      }
      for(int i=0;i<=k-1;i++)
      {
        freq[i]=0;
      }
      for(int i=0;i<=n-1;i++)
      {
        freq[arr[i]-1]++;   
      }
      for(int i=0;i<=k-1;i++)
      {
        System.out.println(i+1+" "+freq[i]);
      }
        
    }
}