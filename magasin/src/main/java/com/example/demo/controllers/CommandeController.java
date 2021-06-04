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

import com.example.demo.models.Commande;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("commandes")
public class CommandeController {

	@Autowired
	private GenericService<Commande> commandeService;
	
	 @GetMapping()
	    public List<Commande> getAll() {
	        return this.commandeService.getAll();
	    }

	    @GetMapping("{id}")
	    public Commande getById(@PathVariable long id) {
	        return this.commandeService.getById(id);
	    }

	    @PostMapping()
	    public Commande save(@RequestBody Commande commande) {
	        return this.commandeService.create(commande);
	    }

	    @PatchMapping()
	    public Commande update(@RequestBody Commande commande) {
	        return this.commandeService.update(commande);
	    }

	    @DeleteMapping("{id}")
	    public void delete(@PathVariable long id) {
	        this.commandeService.delete(id);
	    }
}
