package n1E1jejercicioProduct;

public class Product {
	
	{
		System.out.println("A new product is being added.");
	}

	protected String name;
	protected int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public String toString() {
		return "The name of the product is: " + name + ".\r"
				+"The price of the product is: " + price + ".\r";
	}

}
