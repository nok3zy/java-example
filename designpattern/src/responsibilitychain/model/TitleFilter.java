package responsibilitychain.model;

public class TitleFilter extends ProductFilter {

	@Override
	public void doFilter(Product product) {
		System.out.println("Let's check product's title");
		if (product.title().isBlank()) {
			throw new IllegalArgumentException("INVALID");
		}
		super.doFilter(product);
	}
}
