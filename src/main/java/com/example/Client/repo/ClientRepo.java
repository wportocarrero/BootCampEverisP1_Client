package com.example.Client.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClientRepo extends ReactiveMongoRepository<Client, String>{

}
