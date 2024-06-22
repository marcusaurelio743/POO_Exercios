package Exemplo.entities;

public class Product {
	public String name;
	public Double price;
	public int quantity;
	
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
