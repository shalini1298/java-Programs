import java.util.ArrayList;
public class Main
{
  static void Commonelements (int[]arr1, int[]arr2, int[]arr3)
  {
    ArrayList < Integer > l1 = new ArrayList <> ();
    ArrayList < Integer > l2 = new ArrayList <> ();
    ArrayList < Integer > l3 = new ArrayList <> ();
    for (int i = 0; i < arr1.length; i++)
      l1.add (arr1[i]);
    for (int i = 0; i < arr2.length; i++)
      l2.add (arr2[i]);
    for (int i = 0; i < arr3.length; i++)
      l3.add (arr3[i]);

    l2.retainAll (l1);
    l3.retainAll (l2);
    for (int i:l3)
      System.out.println (i);
  }
  public static void main (String[]args)
  {
    int[] arr1 = { 1, 5, 10, 20, 40, 80 };
    int[] arr2 = { 6, 7, 20, 80, 100 };
    int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
    Commonelements (arr1, arr2, arr3);
  }
}
