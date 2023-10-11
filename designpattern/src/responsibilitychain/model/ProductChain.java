package responsibilitychain.model;

import responsibilitychain.model.PriceFilter;
import responsibilitychain.model.Product;
import responsibilitychain.model.ProductFilter;
import responsibilitychain.model.TitleFilter;

public class ProductChain {
	private final ProductFilter pf = ProductFilter.link(
		new TitleFilter(),
		new PriceFilter()
	);

	public void check(Product product) {
		pf.doFilter(product);
	}
}
