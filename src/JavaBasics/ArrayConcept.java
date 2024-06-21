
package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array - To store similar data type values in a array variable.
		//1. int array - 
		// lowest bound/index= 0
		// upper bound/index= n-1 (n is size of array)
		//one dimentional array
		
		//Dis-advantages of array-
		//1. size is fixed -- static array --To overcome this problem , we use collections--Arraylist,hashtable---use dynamic array
		//2. Stores only similar data types -- To overcome this problem, we use object array.
		
		int i[]=new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println(i.length); // length of array
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		// 2.double array
		
		double d[]=new double[3];
		d[0]= 10.22;
		d[1]= 22.33;
		
		System.out.println(d[2]);
		
		//3. char array
		char c[]=new char[3];
		c[0]='a';
		c[1]=2;
		c[2]='b';
		
		//4. boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String array
		String s[]=new String[3];
		s[0]="hello";
		s[1]="Test";
		s[2]="gayatri";
		System.out.println(s[2]);
		

		//6. Object array -- object is a class -- used to store different data type values.
		Object obj[]=new Object[6];
		obj[0]="Tom";
		obj[1]= 50;
		obj[2] = 99.99;
		obj[3] = "1/1/1999";
		obj[4]='M';
		obj[5]="London";
		
		
		System.out.println(obj.length);
		System.out.println(obj[5]);
		
		for(int k=0;k<obj.length;k++) {
			System.out.println(obj[k]);
		}
		

	}

}
