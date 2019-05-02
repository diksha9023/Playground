import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n= scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=scan.nextInt();
    }
    int p=n/2;
    for(int i=0;i<=p-1;i++)
    {
      for(int j=i+1;j<=p-1;j++)
      {
        if(arr[i]>arr[j])
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=p;i<=n-1;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
        if(arr[i]<arr[j])
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<=n-1;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}