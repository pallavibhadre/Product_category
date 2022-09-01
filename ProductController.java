package api;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl proServiceImpl;	
	
	@GetMapping("/Product/{id}")
	Product getProduct(@PathVariable int id) {
		return proServiceImpl.getProductService(id);
	}

	@GetMapping("/Products")
	List<Product> getProducts() {
		
		return proServiceImpl.getProductsService();
	}

	@PostMapping("/Product")
	String addProduct(@RequestBody Product pro) {
		return proServiceImpl.addProductService(pro);
	}
	
	@DeleteMapping("/Product/{id}")
	String deleteProduct(@PathVariable int id) {
		return proServiceImpl.deleteProductService(id);
	}
	
	@PutMapping("/updateProduct/{id}")
	String updateProduct(@PathVariable int id, @RequestBody Product pro) {
		return proServiceImpl.updateProductService(id, pro);
	}
}
