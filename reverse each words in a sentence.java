public class Main
{
    public static void main(String[] args) {
        String str="i love this very much";
        String str1=str;
        str="";
        String[] arr=str1.split("\\s");
       for(int i=0;i<arr.length;i++){
           String word=arr[i];
           String reverse="";
           for(int j=word.length()-1;j>=0;j--){
               reverse=reverse+word.charAt(j);
           }
           str=str+reverse+" ";
       }
System.out.print(str);
    }
}