package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.models.Commande;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.services.GenericService;

public class CommandeService implements GenericService<Commande> {
	
	@Autowired
    private CommandeRepository commandeRepository;

	@Override
	public List<Commande> getAll() {
		return this.commandeRepository.findAll();
	}

	@Override
	public Commande getById(long id) {
		return this.commandeRepository.findById(id).get();
	}

	@Override
	public Commande create(Commande entity) {
		return this.commandeRepository.save(entity);
	}

	@Override
	public Commande update(Commande entity) {
		return this.commandeRepository.save(entity);
	}

	@Override
	public void delete(long id) {
		this.commandeRepository.deleteById(id);
	}
	
	public List<Commande> findByClientId(Long id) {
		return this.commandeRepository.findByClientId(id);
	}

}
