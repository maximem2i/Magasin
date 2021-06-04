package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.models.Produit;
import com.example.demo.services.GenericService;
import com.example.demo.services.impl.CategorieService;
import com.example.demo.services.impl.ClientService;
import com.example.demo.services.impl.CommandeService;
import com.example.demo.services.impl.ProduitService;

@Configuration
public class ServiceConfig {

	@Bean
	public GenericService<Categorie> categorieServiceFactory() {
        return new CategorieService();
    }
	
	@Bean
	public GenericService<Client> clientServiceFactory() {
        return new ClientService();
    }
	
	@Bean
	public GenericService<Commande> commandeServiceFactory() {
        return new CommandeService();
    }
	
	@Bean
	public GenericService<Produit> produitServiceFactory() {
        return new ProduitService();
    }
}
