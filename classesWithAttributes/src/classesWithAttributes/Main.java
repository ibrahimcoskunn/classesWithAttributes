package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1,"laptop","asus",5000,3);	
		Product product = new Product();
		product.setName("laptop");
		product.setId(1);
		product.setDescription("asus");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
