import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
      StringBuilder sb1= new StringBuilder(str);
      int st_len= sb1.length();
      int arr[]=new int[26];
      for(int i=0;i<=25;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<=st_len-1;i++)
      {
        int offset=0;
       if(sb1.charAt(i)>='a'&&sb1.charAt(i)<='z')
          {
         offset=sb1.charAt(i)-'a';
         arr[offset]++;
       }
        else if(sb1.charAt(i)>='A'&&sb1.charAt(i)<='Z')
          {
         offset=sb1.charAt(i)-'A';
         arr[offset]++;
       }
      }
      for(int i=0;i<=25;i++)
      {
        if(arr[i]==0)
        {
          char missing_alpha=(char)(i+'a');
        System.out.print(missing_alpha+" ");
        }
      }
      
            
            
        
        
        
    }
}