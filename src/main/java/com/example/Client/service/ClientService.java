package com.example.Client.service;

import com.example.Client.model.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
	Flux<Client> findAll();
	Mono<Client> createClient(Client client);
	void deleteClient(String id );
	Mono<Client> findById(String id);
}
