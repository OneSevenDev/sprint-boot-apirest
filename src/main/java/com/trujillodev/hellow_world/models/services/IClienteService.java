package com.trujillodev.hellow_world.models.services;

import java.util.List;

import com.trujillodev.hellow_world.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
}
