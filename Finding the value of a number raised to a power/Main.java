import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
         int base=scan.nextInt();
        int ex=scan.nextInt();
      int mul=1;
        for(int i=1;i<=ex;i++)
        {
          mul=mul*base;
        }
      System.out.println(mul);
    }
}