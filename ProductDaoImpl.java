package api;

import java.util.List;

import com.Jbk.entity.Product;


public interface ProductDaoImpl {

	Product getProductDao(int id);
	List<Product> getProductDao();
	String addProductDao(Product pro);
	String deleteProductDao(int id);
	String updateProductDao(int id, Product pro);
}
