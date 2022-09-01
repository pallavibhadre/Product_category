package api;

import java.util.List;



public interface ProductServiceImpl {
	Product getProductService(int id);

	List<Product> getProductsService();

	String addProductService(Product pro);

	String deleteProductService(int id);
	
	String updateProductService(int id, Product pro);
}
