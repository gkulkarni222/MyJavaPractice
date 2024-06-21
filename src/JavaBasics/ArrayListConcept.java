package JavaBasics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add("Hello");
		ar.add("Tom");
		ar.add(12.33);
		ar.add('A');
		
		ar.add(500);
		System.out.println(ar.size());
		ar.remove(8);
		System.out.println(ar.size());
		
		//print all elements from arraylist
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(100);
		//a.add("hello");------error
		
		ArrayList<String>b=new ArrayList<String>();
		b.add("Hello");

	}

}
