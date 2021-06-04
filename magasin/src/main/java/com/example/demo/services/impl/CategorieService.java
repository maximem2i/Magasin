package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Categorie;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.services.GenericService;

public class CategorieService implements GenericService<Categorie> {

	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public List<Categorie> getAll() {
		return this.categorieRepository.findAll();
	}

	@Override
	public Categorie getById(long id) {
		return this.categorieRepository.findById(id).get();
	}

	@Override
	public Categorie create(Categorie entity) {
		return this.categorieRepository.save(entity);
	}

	@Override
	public Categorie update(Categorie entity) {
		return this.categorieRepository.save(entity);
	}

	@Override
	public void delete(long id) {
		this.categorieRepository.deleteById(id);
	}

}
