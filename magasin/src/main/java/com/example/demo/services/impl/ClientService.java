package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.services.GenericService;

public class ClientService implements GenericService<Client> {
	
	@Autowired
    private ClientRepository clientRepository;

	@Override
	public List<Client> getAll() {
		return this.clientRepository.findAll();
	}

	@Override
	public Client getById(long id) {
		return this.clientRepository.findById(id).get();
	}

	@Override
	public Client create(Client entity) {
		return this.clientRepository.save(entity);
	}

	@Override
	public Client update(Client entity) {
		return this.clientRepository.save(entity);
	}

	@Override
	public void delete(long id) {
		this.clientRepository.deleteById(id);
	}

}
