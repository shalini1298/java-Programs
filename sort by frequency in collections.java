/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,1,4,4,4,4,2,2,2,6,5};
	    HashMap<Integer,Integer> map= new HashMap<>();
	    List<Integer> list=new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        if(map.get(arr[i])==null){
	            list.add(arr[i]);
	        map.put(arr[i],1);
	        }
	        else{
	        int frequency=map.get(arr[i]);
	        map.put(arr[i],frequency+1);
	        list.add(arr[i]);
	        }
	    }
	    Sort obj=new Sort(map);
	    Collections.sort(list,obj);
	    for(int i:list)
	    System.out.print(i+" ");
	}
}
	    class Sort implements Comparator<Integer>{
	        private final Map<Integer, Integer> freqMap;
    Sort(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
  
  @Override
  public int compare(Integer k1,Integer k2){
       int freq = freqMap.get(k2).compareTo(freqMap.get(k1)); 
        int value= k1.compareTo(k2); 
        if (freq == 0) 
            return value; 
        else
            return freq; 
  }
	    }