public class Main
{
    public static void main(String[] args) {
        String str="i love this very much";
        String str1=str;
        str="";
        String[] arr=str1.split("\\s");
        for (String s : arr) {
str=str+(Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()) + " ");
}
System.out.print(str);
    }
}