package com.product.RESTapi.serve;

import org.springframework.stereotype.Service;
import java.util.List;
import com.product.RESTapi.model.Product;
import com.product.RESTapi.model.ProductRequest;
@Service
public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(ProductRequest request);
	Product getProductById(long id);
	void removeProductById(long id);
	void update(Product product);
}
