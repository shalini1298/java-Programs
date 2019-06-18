/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}import java.util.*;
class Laptop {
	String brand;
	int price;
	int ramGb;
	
	public Laptop(String brand,int price,int ramGb) {
		this.brand=brand;
		this.price=price;
		this.ramGb=ramGb;
	}
}
class SortByBrand implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1,Laptop l2) {
		return l1.brand.compareTo(l2.brand);
	}
}
public class Main {
public static void main(String[] args) {
	ArrayList<Laptop> ar=new ArrayList<Laptop>();
	Laptop l1=new Laptop("Del",12000,16);
	Laptop l2=new Laptop("Hp",15000,4);
	Laptop l3=new Laptop("Apple",14000,8);
	ar.add(l1);
	ar.add(l2);
	ar.add(l3);
	Collections.sort(ar,new SortByBrand());
	for(Laptop temp:ar) {
		System.out.println("Brand:" + temp.brand);
		System.out.println("Price:"+ temp.price);
		System.out.println("RamGb:"+ temp.ramGb);
		}
	
} 
}

	

}
