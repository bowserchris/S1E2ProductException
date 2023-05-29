package n1E1jejercicioProduct;

public class App {

	public static void main(String[] args) {
		
		Product product = new Product("veg", 5);
		
		Sale sale = new Sale(100);
		
		sale.getProductList().add(product);
		
		sale.getProductList().get(2);
			
		System.out.println(sale.calculateTotalSales()); // si quitas Product producto y los metodos con .getProductList() el metodo calcular da el mensaje pedido.
		
	}

}

/*
 * Create a class called "Product" with the name and price attributes, 
 * and another class called "Sale". This class has as attributes a collection 
 * of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom 
exception SaleEmptyException and displays "To make a sale you must first add 
products" if the collection of products is empty. If the collection has products, 
then it must loop through the collection and store the sum of all the product prices 
in the totalsaleprice attribute.

The custom exception VendaBuidaException must be a child of the Exception class. 
To its constructor we must pass the message "To make a sale you must first add products"
 and when we capture the exception, we must display it on the screen with the getMessage() 
 method of the exception.

Write the necessary code to generate and catch an exception of type ArrayIndexOutOfBoundsException.
 * 
 * 
 * */
