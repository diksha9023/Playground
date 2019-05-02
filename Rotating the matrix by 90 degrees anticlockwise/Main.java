import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan= new Scanner(System.in);
    int r=scan.nextInt();
    int c=scan.nextInt();
    int matrix[][]=new int[r][c];
    for(int i=0;i<=r-1;i++)
    {
      for(int j=0;j<=c-1;j++)
      {
        matrix[i][j]=scan.nextInt();
      }
    }
    for(int i=r-1;i>=0;i--)
    {
      for(int j=0;j<=c-1;j++)
      {
        System.out.print(matrix[j][i]+" ");
      }
      System.out.println();
    }
  }
}