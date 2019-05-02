import java.util.Scanner;
class Main{
  public static int great_no(int x,int y,int z)
  {
    int large=0;
     if(x>y&&x>z)
       large=x;
    else if(y>z)
      large= y;
    else 
      large=z;
    return(large);
  }
        
	public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
         int n1= scan.nextInt();
      int n2= scan.nextInt();
      int n3= scan.nextInt();
      int gt= great_no(n1,n2,n3);
      System.out.println(gt);
	}
}