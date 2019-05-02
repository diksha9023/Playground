import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  n =scan.nextInt();
       int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
         arr[i]=scan.nextInt();
      }
      int max=arr[0];
      for(int i=0;i<=n-1;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);

    }
}