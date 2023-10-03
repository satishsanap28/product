//package com.satya.product.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.satya.product.model.ProductEntity;
//import com.satya.product.repository.ProductRepository;
//
//@Service
//public class ProductServiceWithDB {
//	private final ProductRepository productRepository;
//
//	@Autowired
//	    public ProductServiceWithDB(ProductRepository productRepository) {
//	        this.productRepository = productRepository;
//	    }
//
//	public List<ProductEntity> getAllProducts() {
//		return productRepository.findAll();
//	}
//
//	public Optional<ProductEntity> getProductById(Long id) {
//		return productRepository.findById(id);
//	}
//
//	public ProductEntity createProduct(ProductEntity product) {
//		return productRepository.save(product);
//	}
//
//	public ProductEntity updateProduct(Long id, ProductEntity product) {
//		if (productRepository.existsById(id)) {
//			product.setId(id);
//			return productRepository.save(product);
//		}
//		return null;
//	}
//
//	public void deleteProduct(Long id) {
//		productRepository.deleteById(id);
//	}
//}
