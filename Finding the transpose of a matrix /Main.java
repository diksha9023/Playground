import java.util.Scanner;
class Main{
  public static void main(String args[]){
       Scanner scan= new Scanner(System.in);
      int row_size=scan.nextInt();
    int col_size=scan.nextInt();
    int matrix[][]=new int[row_size][col_size];
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        matrix[i][j]=scan.nextInt();
      }
    }
    int trans[][]= new int[col_size][row_size];
    for(int i=0;i<=row_size-1;i++)
    {
      for(int j=0;j<=col_size-1;j++)
      {
        trans[j][i]=matrix[i][j];
      }
    }
    for(int i=0;i<=col_size-1;i++)
    {
      for(int j=0;j<=row_size-1;j++)
      {
        System.out.print(trans[i][j]+ " ");
      }
      System.out.println();
    }
  }
}