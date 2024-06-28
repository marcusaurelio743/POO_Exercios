package Exemplo.entities;

public class Product {
	private String name;
	private Double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product( String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product( String name, Double price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void AddProduct(int quantity) {
		this.quantity+=quantity;
	}
	public void RemoveProduct(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return name
				+", $ "
				+String.format("%.2f", price)+
				" , "+
				quantity+
				" units, total:$ "+
				String.format("%.2f",totalValueInStock());
	}

}
