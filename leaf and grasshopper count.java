import java.util.*;
public class Main{
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int leaf=scan.nextInt();
int[] leafc=new int[leaf];
int k=1;
int count=0;
int cp=scan.nextInt();
int[] ch=new int[cp];
for(int i=0;i<leaf;i++){
leafc[i]=k;
k++;
}
for(int i=0;i<cp;i++){
ch[i]=scan.nextInt();
}
for(int i=0;i<cp;i++){
for(int j=0;j<leaf;j++){
if(leafc[j]%ch[i]==0)
leafc[j]=0;
}
}
for(int j=0;j<leaf;j++){
if(leafc[j]!=0)
count++;
}
System.out.println(count);
}
}