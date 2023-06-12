package n1E1jejercicioProduct;

import lombok.Data;//automaticamente crea getters y setters y toString

@Data

public class Product {
	
	{
		System.out.println("A new product is being added.");
	}

	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	

}
