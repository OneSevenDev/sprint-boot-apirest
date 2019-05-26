package com.trujillodev.hellow_world.models.services;

import java.util.List;

import com.trujillodev.hellow_world.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
}
