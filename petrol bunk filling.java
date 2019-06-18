import java.util.*;
public class Main{
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int pb=scan.nextInt();
int[] arr=new int[pb*2];
int count=0,org=0,count1=0,diff=0,k=0;
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}
for(int i=0;i<arr.length-1;){
if((arr[i]-arr[i+1])>0){
  k++;
if(k==1)
   org=count+1;
   diff=arr[i]-arr[i+1];
    i+=2;
              if(i>=arr.length)
                  i=0;
               arr[i]=arr[i]+diff;
               }
      else {
         count++;
i+=2;
}       
}
                    
System.out.println(org);
}}