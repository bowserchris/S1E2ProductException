package n1E1jejercicioProduct;

public class SalesEmptyException extends Exception {
	
	/**
	 * Prints error message when arrayList is empty.
	 */

	public SalesEmptyException(String errorMessage) {
		super(errorMessage);
	}
	
	public String getMessage() {
		return"To make a sale you must first add products";
	}

}

/*

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