package com.product.RESTapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.RESTapi.model.Product;
import com.product.RESTapi.model.ProductRequest;
import com.product.RESTapi.repo.ProductRepo;
import com.product.RESTapi.serve.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public void saveProduct(ProductRequest request) {
		Product product = new Product();
		product.setName(request.getName());
		product.setPrice(request.getPrice());
		productRepo.save(product);
	}

	@Override
	public Product getProductById(long id) {
		Product product = null;
		Optional<Product> optional = productRepo.findById(id);
		if(optional!=null) {
			product=optional.get();
		}else {
			throw new RuntimeException("Product Not Found !!!");
		}
		return product;
	}

	@Override
	public void removeProductById(long id) {
		productRepo.deleteById(id);
		
	}

	@Override
	public void update(Product product) {
		productRepo.save(product);		
	}

}
