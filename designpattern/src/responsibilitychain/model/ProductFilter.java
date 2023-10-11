package responsibilitychain.model;

public abstract class ProductFilter {
	private ProductFilter next;

	public static ProductFilter link(ProductFilter first, ProductFilter... chain) {
		ProductFilter head = first;
		for (ProductFilter next : chain) {
			head.next = next;
			head = next;
		}
		return first;
	}

	public void doFilter(Product product) {
		if (next != null) {
			next.doFilter(product);
		}
	}
}
