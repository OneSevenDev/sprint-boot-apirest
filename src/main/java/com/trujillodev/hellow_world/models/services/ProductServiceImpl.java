package com.trujillodev.hellow_world.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trujillodev.hellow_world.models.dao.IProductDao;
import com.trujillodev.hellow_world.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDao productDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) productDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productDao.deleteById(id);
	}
	

}
