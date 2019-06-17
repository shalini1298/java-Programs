import java.util.*;
public class Main{
public static void main(String[] args)
{
 // Scanner scan=new Scanner(System.in);
int n=7;//scan.nextInt();
int j=0,count=0,max=0;
String temp="",temp1="";
String[] str=new String[n];
String[] str1=new String[n];
//for(int i=0;i<n;i++)
// str[i]=scan.nextLine();
//scan.close();
str[0]="28,3,enter";
str[1]="82,2,exit";
str[2]="38,6,enter";
str[3]="43,1,enter";
str[4]="44,0,enter";
str[5]="45,5,exit";
str[6]="51,3,exit";
for(int i=0;i<str.length;i++){
    str1=str[i].split(",");
    if(str1[2].equals("enter"))
    count=count+Integer.parseInt(str1[1]);
    else if(str1[2].equals("exit")){
      if(max==count)
         temp1=str1[0];
    count=count-Integer.parseInt(str1[1]);
    }
    if(count>max){
    max=count;
    temp=str1[0];
    }
    
}
System.out.println(temp);
System.out.println(temp1);
}
}