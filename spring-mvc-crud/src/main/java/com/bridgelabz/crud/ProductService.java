/******************************************************************************
 *  Purpose: Class is implemented for creating the POJO class
 *  		 @Entity will tell the spring framework that this is POJO class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> listAll() {
		return productRepository.findAll();
	}

	public void save(Product product) {
		productRepository.save(product);
	}

	public Product get(Long id) {
		return productRepository.findById(id).get();
	}

	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
