package com.trujillodev.hellow_world.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trujillodev.hellow_world.models.entity.Cliente;
import com.trujillodev.hellow_world.models.services.IClienteService;

@CrossOrigin(origins = {
		"http://localhost:4200"
})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		// TODO Auto-generated method stub
		return clienteService.findAll();
	}
}
