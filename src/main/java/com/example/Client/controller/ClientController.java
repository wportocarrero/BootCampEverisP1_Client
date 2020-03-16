package com.example.Client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Client.model.Client;
import com.example.Client.repo.ClientRepo;
import com.example.Client.service.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ClientController {
	@RestController
	@RequestMapping("/client")
	public class AccountController {
		
		@Autowired
		private ClientService IclientService;
		
		@Autowired
		private ClientRepo arep;
		
		@GetMapping("/findAll")
		public Flux<Client> findAll(){
			return IclientService.findAll();
		}
		
		@GetMapping("/findby/{id}")
		public Mono<Client> findbyDni(@PathVariable String id) {
			System.out.println(IclientService.findById(id));
			return IclientService.findById(id);
		}
		
		@PostMapping("/create")
		public Mono<Client> createAccount(@RequestBody Client account) {
			return IclientService.createClient(account);
		}
		
		@DeleteMapping("/deleteClient/{id}")
		public String dlClient(@PathVariable String id) {
			arep.deleteById(id);
			return "client erased : " + id;
		}
}
}
