package com.trujillodev.hellow_world.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.trujillodev.hellow_world.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
