import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
         for(int i=1;i<=num;i++)
         {
            if(i%2==1)
            System.out.println(i);
         }
	}
}