package CollectionProgramming;

import java.util.ArrayList;

public class WebShopApp {

	public static void main(String[] args) {
		
   ArrayList<Product> products = new ArrayList<>();
   products.add(new Product("fidget spiinner",3.99 ,"its fun"));
   products.add(new Product("Earburds",39.99 ,"extrembly good sound"));
   products.add(new Product("Earburds",39.99 ,"extrembly good sound"));
   
   products.add(1, new Product("36 AAA batteries",10.99,"High performance alkaline batteries."));
   
   
   //System.out.println(products);
   products.remove(2);
   //products.remove(new Product("Earburds",39.99 ,"extrembly good sound"));
   
   products.set(0,new Product("Robert Duck",9.22,"you cant bath without this."));
   for(Product product:products) {
	   System.out.println(product);
	   
   }
   System.out.println("The third element of the list");
   System.out.println(products.get(2));
	}

}
