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

import com.example.demo.models.Client;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("clients")
public class ClientController {

	@Autowired
	private GenericService<Client> clientService;
	
	 @GetMapping()
	    public List<Client> getAll() {
	        return this.clientService.getAll();
	    }

	    @GetMapping("{id}")
	    public Client getById(@PathVariable long id) {
	        return this.clientService.getById(id);
	    }

	    @PostMapping()
	    public Client save(@RequestBody Client client) {
	        return this.clientService.create(client);
	    }

	    @PatchMapping()
	    public Client update(@RequestBody Client client) {
	        return this.clientService.update(client);
	    }

	    @DeleteMapping("{id}")
	    public void delete(@PathVariable long id) {
	        this.clientService.delete(id);
	    }
}
