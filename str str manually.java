import java.util.*;
public class strstr{
public static void main(String[] args){
String str1="";
String str2="";
int count=0;
Scanner scan=new Scanner(System.in);
str1=scan.nextLine();
str2=scan.nextLine();
scan.close();
char[] ch1=str1.toCharArray();
char[] ch2=str2.toCharArray();
int n=ch2.length,k=0;
for(int i=0;i<ch1.length;i++){
     if(ch2[0]==ch1[i]){
k=i;
break;
}
}
count=k;
for(int i=0;i<ch2.length;i++){
 for(int j=k;j<n+k;j++){
     if(ch2[i]==ch1[j]){
    count++;
  }else
  count--;
  }
}
if(count==n-1)
System.out.println(k);
else
System.out.println("-1");
}
}
