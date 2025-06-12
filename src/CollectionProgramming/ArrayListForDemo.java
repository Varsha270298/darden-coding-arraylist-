package CollectionProgramming;

import java.util.ArrayList;

public class ArrayListForDemo {

	public static void main(String[] args) 
	{
        ArrayList a1= new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        for(int i=0;i<a1.size();i++)
        {
        	System.out.println(a1.get(i));
        }

	}

}
