import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int r=scan.nextInt();
    int c= scan.nextInt();
    int matrix[][]=new int[r][c];
    for(int i=0;i<=r-1;i++)
    {
      for(int j=0;j<=c-1;j++)
      {
        matrix[i][j]=scan.nextInt();
      }
    }
    
   
    for(int p=0;p<=c-1;p++)
    {
      for(int q=0,t=p;t<=c-1;t++,q++)
      {
       
          System.out.print(matrix[q][t]+" ");
//System.out.println();//
      }
    }
  }
}