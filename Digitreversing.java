import java.io.*;
import java.util.*;
import java.lang.*;
 
class Reversenumber
{
   public static void main(String args[])
   {
      int num, reversenum = 0;
 
      System.out.println("Enter the Number to Reverse :");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
 
      while( num != 0 )
      {
          reversenum = reversenum* 10;
          reversenum = reversenum + num%10;
          num= num/10;
      }
 
      System.out.println("Reverse of Entered Number is  :"+reversenum);
   }
}
