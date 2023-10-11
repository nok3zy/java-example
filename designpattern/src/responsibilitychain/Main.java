package responsibilitychain;

import responsibilitychain.model.Product;
import responsibilitychain.model.ProductChain;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("Title", "Description", 1L);

		ProductChain productChain = new ProductChain();
		productChain.check(product);
		System.out.println("The Product is valid");
	}
}
