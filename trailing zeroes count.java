public class Main
{
    static void trailingZeroes(int a){
        int count=0,i=0;
        int[] arr=new int[32];
        i=arr.length-1;
        while(a!=0){
        arr[i--]=a%2;
        a=a/2;
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==0)
            count++;
            else
            break;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
    trailingZeroes(512);
    }
}