package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jbk.service.ProductServiceImpl;



@Service
public class ProductService implements ProductServiceImpl{
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	public Product getProductService(int id) {
		return ProductDaoImpl.getProductDao(id);
	}
	
	public List<Product> getProductsService(){
		return productDaoImpl.getProductsDao();
	}
	
	public String addProductService(Product pro) {
		return productDaoImpl.addProductDao(pro);
	}
	
	public String deleteProductService(int id) {
		return productDaoImpl.deleteproductDao(id);
	}
	
	public String updateProductService(int id, Product pro) {
		return productDaoImpl.updateproductDao(id, pro);
	}
}
