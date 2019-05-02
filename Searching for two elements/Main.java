import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
         int n=scan.nextInt();
         int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
         arr[i]=scan.nextInt();
      }
      int search1=scan.nextInt();
      int search2=scan.nextInt();
      int eindex1=-1;
      int eindex2=-1;
      for(int i=0;i<=n-1;i++)
      {
        if(search1==arr[i])
        {
          eindex1=i;
        }
        if(search2==arr[i])
        {
          eindex2=i;
        }
      }
      System.out.println(eindex1);
      System.out.println(eindex2);
      
    }
}