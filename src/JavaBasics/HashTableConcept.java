package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		
		h.put(1,"Gayatri");
		h.put(2, "Nilima");
		
		System.out.println(h.size());
		
		h.put('A',100);
		h.put(3, 200);
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(10, 500);
		
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(20, "Test");
		
		
		
		

	}

}
