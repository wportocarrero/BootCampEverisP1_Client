package com.example.Client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Client.model.Client;
import com.example.Client.repo.ClientRepo;
import com.example.Client.service.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepo dao;
	
	@Override
	public Flux<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public Mono<Client> createClient(Client client) {
		return dao.save(client);
	}

	@Override
	public void deleteClient(String id) {
		dao.deleteById(id);
	}

	@Override
	public Mono<Client> findById(String id) {
		return dao.findById(id);
	}

}
