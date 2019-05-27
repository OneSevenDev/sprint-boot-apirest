package com.trujillodev.hellow_world.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trujillodev.hellow_world.models.entity.Product;

public interface IProductDao extends CrudRepository<Product, Long> {

}
