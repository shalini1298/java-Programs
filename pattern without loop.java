public class Main
{
static void patLoop(int n){
if(n==0||n<0){
System.out.print(""+n);
return;
}
System.out.print(" "+n);
patLoop(n-5);
System.out.print(" "+n);
}
	public static void main(String[] args) {
int n=16;
patLoop(n);
	}
}