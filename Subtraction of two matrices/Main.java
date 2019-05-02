import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner scan= new Scanner(System.in);
    int row_size=scan.nextInt();
    int col_size=scan.nextInt();
    int matrix1[][]=new int[row_size][col_size];
    int matrix2[][]=new int[row_size][col_size];
    int sub[][]=new int[row_size][col_size];
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        matrix1[i][j]=scan.nextInt();
      }
    }
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        matrix2[i][j]=scan.nextInt();
      }
    }
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        sub[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        System.out.print(sub[i][j]+" ");
      }
      System.out.println();
    }
        
    
  }
}