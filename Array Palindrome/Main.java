import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
       int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=scan.nextInt();
      }
     int left=0;
     int right=n-1;
      int is_found=0;
     while(left<=right)
     {
       if(arr[left]!=arr[right])
       {
         is_found=1;
         break;
       }
       left++;
       right--;
     }
      if(is_found==0)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
    }
}