package CollectionProgramming;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("Kartik");
		a1.add(20.20);
		a1.add(false);
		a1.add('a');
		a1.add(10);
		a1.remove(5);
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		System.out.println(a1);
		ArrayList al1= new ArrayList();
		al1.add("mango");
		al1.add("Apple");
		System.out.println(al1);
		al1.add(a1);
		System.out.println(al1);
		
		

	}

}
