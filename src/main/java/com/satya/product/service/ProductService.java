package com.satya.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.satya.product.model.ProductEntity;

@Service
public class ProductService {
	private final List<ProductEntity> productList = new ArrayList<>();
	private Long idCounter = 1L;

	public ProductEntity createProduct(ProductEntity product) {
		product.setId(idCounter);
		productList.add(product);
		idCounter++;
		return product;
	}

	public Optional<ProductEntity> getProductById(Long id) {
		return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
	}

	public List<ProductEntity> getAllProducts() {
		return new ArrayList<>(productList);
	}

	public ProductEntity updateProduct(Long id, ProductEntity product) {
		for (int i = 0; i < productList.size(); i++) {
			ProductEntity existingProduct = productList.get(i);
			if (existingProduct.getId().equals(id)) {
				product.setId(id);
				productList.set(i, product);
				return product;
			}
		}
		return null;
	}

	public void deleteProduct(Long id) {
		productList.removeIf(product -> product.getId().equals(id));
	}
}
