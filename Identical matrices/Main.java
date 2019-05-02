import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner scan = new Scanner(System.in);
    int r=scan.nextInt();
    int c=scan.nextInt();
    int matrix1[][]=new int[r][c];
    int matrix2[][]=new int[r][c];
    for(int i=0;i<=r-1;i++)
    {
      for(int j=0;j<=c-1;j++)
      {
        matrix1[i][j]=scan.nextInt();
      }
    }
         for(int i=0;i<=r-1;i++)
    {
      for(int j=0;j<=c-1;j++)
      {
        matrix2[i][j]=scan.nextInt();
      }
    }
    int is_same=0;
     for(int i=0;i<=r-1;i++)
    {
      for(int j=0;j<=c-1;j++)
      {
        if(matrix1[i][j]!=matrix2[i][j])
        {
          is_same=1;
          break;
        }
      }
    }
    if(is_same==0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}