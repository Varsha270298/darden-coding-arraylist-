package CollectionProgramming;

import java.util.Objects;

public class Product {

	private String name;
	private double price;
	private String description;
	
	
	public Product(String name, double price, String description) {
		
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product product = (Product) obj;
		return Objects.equals(description, product.description) && Objects.equals(name, product.name)
				&& Double.compare(product.price,price)==0;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", description=" + description + "]";
	}


		


	
	
	
}
