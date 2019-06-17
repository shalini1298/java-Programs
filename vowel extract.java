import java.util.*;
public class Main
{
    public static void main(String[] args) {
   //Scanner scan=new Scanner(System.in);
    //  String str=scan.nextLine();
//scan.close();
String str="aquickbrownfox";
      int k=0,index1=0,index2=0,x=0;
      char temp='0';
      char ch[] =str.toCharArray();
      char a[]=new char[ch.length];
        for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
        {
        a[k]=ch[i];
         k++;
        }
if(k==0)
  index1=i;
index2=index1;
        } 
        temp=a[k-1];
       for(int i=index1+1;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
        {
index2=index2+1;
        ch[i]=a[x];
         x++;
        } 
else
ch[i]=ch[i]; 
        }
ch[index1]=a[k-1]; 
for(int i=0;i<ch.length;i++)
System.out.print(ch[i]);        
  }
}

