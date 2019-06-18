public class Main
{
  public static void main (String[]args)
  {
    String str = "zohocorporation";
    char temp = '0';
    char[] ch = str.toCharArray ();
    int n = ch.length;
    for (int i = 0; i < n; i++)
      {
	temp = ch[i];
	ch[i] = ch[n - 1];
	ch[n - 1] = temp;
	n--;
      }
    System.out.println (ch);
  }
}
