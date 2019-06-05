import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  String str;
  int flag=0;
  System.out.println("Enter a string to check if it is a Palindrome");
  str=obj.next();
  int m=str.length();
  for(int i=0;i<=m/2;i++)
   {
    if(str.charAt(i)==str.charAt(m-1))
    {
     m--;
    }
    else
    {
     flag=1;
     System.out.println("String is not a Palindrome");
     break;
    }  
   }
   if(flag==0)
   {
    System.out.println("Entered string: "+"\'"+ str +"\'" + "is palindrome");
   }
 }
}