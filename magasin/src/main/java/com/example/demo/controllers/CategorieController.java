package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Categorie;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private GenericService<Categorie> categorieService;
	
	 @GetMapping()
	    public List<Categorie> getAll() {
	        return this.categorieService.getAll();
	    }

	    @GetMapping("{id}")
	    public Categorie getById(@PathVariable long id) {
	        return this.categorieService.getById(id);
	    }

	    @PostMapping()
	    public Categorie save(@RequestBody Categorie categorie) {
	        return this.categorieService.create(categorie);
	    }

	    @PatchMapping()
	    public Categorie update(@RequestBody Categorie categorie) {
	        return this.categorieService.update(categorie);
	    }

	    @DeleteMapping("{id}")
	    public void delete(@PathVariable long id) {
	        this.categorieService.delete(id);
	    }
}
