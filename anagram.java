/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    String str1 = scan.nextLine ();
    String str2 = scan.nextLine ();
      scan.close ();
    int count = 0;
      str1 = str1.toUpperCase ();
      str2 = str2.toUpperCase ();
    char[] ch1 = str1.toCharArray ();
    char[] ch2 = str2.toCharArray ();
      Arrays.sort (ch1);
      Arrays.sort (ch2);
    if (ch1.length == ch2.length)
      {
	for (int i = 0, j = 0; i < ch1.length; i++, j++)
	  {
	    if (ch1[i] == ch2[j] && i == j)
	      count++;
	  }
	if (count == ch1.length)
	  System.out.println ("true");
	else
	  System.out.println ("false");
      }
    else
      System.out.print ("false");
  }
}
