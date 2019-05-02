import java.util.Scanner;
class Main
{ 

  public static int pow(int x,int y)
  {
     int mul= 1;
    for(int i=1;i<=y;i++)
    {
      mul=mul*x;
    }
     return(mul);
  }
    
  public static void main(String []args)
  {
     Scanner scan = new Scanner(System.in);
     int base = scan.nextInt();
     int exp = scan.nextInt();
      int p= pow(base,exp);
      System.out.println(p);
  }
}