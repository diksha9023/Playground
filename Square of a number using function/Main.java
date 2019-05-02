import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int sq=num*num;
    return sq;
  }
	public static void main (String[] args)
    {
	   Scanner scan = new Scanner(System.in);
       int n =scan.nextInt();
       int sq1=square(n);
      System.out.println(sq1);

	} 
}