package br.com.constructor1.entities;

public class Product {

	
	private String name;
	private Integer quantity;
	private Double price;
	
	public Product() {}
	
	public Product(String name, Integer quantity, Double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double total() {
		return this.quantity * this.price;
	}
	
	@Override
	public String toString() {
		return "Product name: "
				+name
				+", R$ "
				+quantity
				+" units , "
				+String.format("%.2f", total());
	}
	
}
