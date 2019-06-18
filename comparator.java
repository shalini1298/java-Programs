import java.util.*;
class Main{
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
class SortByPrice implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1,Laptop l2) {
		return l1.price-l2.price;
	}
}
class SortByramGb implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1,Laptop l2) {
		return l1.ramGb-l2.ramGb;
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
	int n=Integer.parseInt(args[0]);
	switch(n) {
	case 1:
	Collections.sort(ar,new SortByBrand());
	break;
	case 2:
	Collections.sort(ar,new SortByPrice());
	break;
	default:
	Collections.sort(ar,new SortByramGb());
	break;
	}
	for(Laptop temp:ar) {
		System.out.println("Brand:" + temp.brand);
		System.out.println("Price:"+ temp.price);
		System.out.println("RamGb:"+ temp.ramGb);
		System.out.println();
		}
	
} 
}

	
