public class Main
{
    public static void main(String[] args) {
        String str="this is alpha 4057 and 55587";
        char[] ch=str.toCharArray();
        String str1="",sum="";
        int count=0,max=0,n=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])) {
           sum=sum+ch[i];
           count=1;
            }
        else if(count!=0){
          if(!sum.contains("9")){
           n=Integer.parseInt(sum);
           if(max<n)
           max=n;
        }
        sum="";
        count=0;
        }
        }
        if(!sum.contains("9")&&sum!=""){
           n=Integer.parseInt(sum);
           if(max<n)
           max=n;
        }
        if(max!=0)
        System.out.println(max);
        else
        System.out.println("-1");
    }
}