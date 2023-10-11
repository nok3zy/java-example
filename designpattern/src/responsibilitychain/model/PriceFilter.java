package responsibilitychain.model;

public class PriceFilter extends ProductFilter {
	@Override
	public void doFilter(Product product) {
		System.out.println("Let's check product's prices");
		if (product.price() == 0) {
			throw new IllegalArgumentException("INVALID");
		}
		super.doFilter(product);
	}
}
