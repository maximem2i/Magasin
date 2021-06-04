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

import com.example.demo.models.Produit;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("produits")
public class ProduitController {

	@Autowired
	private GenericService<Produit> produitService;
	
	 @GetMapping()
	    public List<Produit> getAll() {
	        return this.produitService.getAll();
	    }

	    @GetMapping("{id}")
	    public Produit getById(@PathVariable long id) {
	        return this.produitService.getById(id);
	    }

	    @PostMapping()
	    public Produit save(@RequestBody Produit produit) {
	        return this.produitService.create(produit);
	    }

	    @PatchMapping()
	    public Produit update(@RequestBody Produit produit) {
	        return this.produitService.update(produit);
	    }

	    @DeleteMapping("{id}")
	    public void delete(@PathVariable long id) {
	        this.produitService.delete(id);
	    }
}
