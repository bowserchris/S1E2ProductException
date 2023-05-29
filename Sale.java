package n1E1jejercicioProduct;
import java.util.ArrayList;

public class Sale {
	
	{
		System.out.println("A new sale is being done.");
	}
	
	protected ArrayList<Product> productList;
	protected int totalSalesPrice;
	
	public Sale(int totalSalesPrice) {
		this.productList = new ArrayList<Product>();
		this.totalSalesPrice = totalSalesPrice;
	}
	
	public ArrayList<Product> getProductList(){
		return productList;
	}
	
	public int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	public void setTotalSalesPrice(int totalSalesPrice) {
		this.totalSalesPrice = totalSalesPrice;
	}
	
	public int calculateTotalSales() { // throws SalesEmptyException;
		try {
			//System.out.println("Entered try statement.");
			for (int i = 0; i < productList.size(); i++) {
				totalSalesPrice += productList.get(i).getPrice();
			}
			if (productList.size() == 0) {
				throw new SalesEmptyException("EmptySalesException");
			}
		} catch (SalesEmptyException e) {  
			//throw new SalesEmptyException(e.getMessage());
			System.out.println(e.getMessage());
		} /*finally {
			if (productList != null) {
			System.out.println("List is being assembled.");
			}
		}*/
		return totalSalesPrice;
	}
	
	public String toString() {
		return "The total price of this sale is: " + totalSalesPrice + ".\r";
	}

}
