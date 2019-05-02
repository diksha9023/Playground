import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
      for(int i=0;i<=(2*n-1);i++)
      {
        if(i%2==1)
          System.out.println(i);
      }
	}
}