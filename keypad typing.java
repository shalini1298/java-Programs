import java.util.*;

public class Keypad
{

  public static void main (String[]args)
  {

    String s = "amazon";

    String count = "";

    char[] ch = s.toLowerCase ().toCharArray ();

    for (int i = 0; i < ch.length; i++)
      {

	if ("abc".contains (Character.toString (ch[i])))

	  count = count.concat ("2");

	else if ("def".contains (Character.toString (ch[i])))

	  count = count + "3";

	else if ("ghi".contains (Character.toString (ch[i])))

	  count = count + "4";

	else if ("jkl".contains (Character.toString (ch[i])))

	  count = count + "5";

	else if ("mno".contains (Character.toString (ch[i])))

	  count = count + "6";

	else if ("pqrs".contains (Character.toString (ch[i])))

	  count = count + "7";

	else if ("tuv".contains (Character.toString (ch[i])))

	  count = count + "8";

	else if ("wxyz".contains (Character.toString (ch[i])))

	  count = count + "9";

      }

    System.out.print (count);

  }
}
