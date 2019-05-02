import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner scan = new Scanner(System.in);
      int num =scan.nextInt();
      int i=1;
       while(i<= num)
       {
          if(num%i==0)
          {
            System.out.println(i);
          }
         i++;
       }
	}
}