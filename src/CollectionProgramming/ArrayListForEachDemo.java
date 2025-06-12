package CollectionProgramming;

import java.util.ArrayList;

public class ArrayListForEachDemo {

	public static void main(String[] args)
	{
       ArrayList a1= new ArrayList();
       a1.add(40);
       a1.add(30);
       a1.add(10);
       a1.add(20);
       for(Object i:a1)
       {
    	   System.out.println(i);
    	   
       }
	}

}
