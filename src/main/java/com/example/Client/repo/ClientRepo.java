package com.example.Client.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Client.model.Client;

@Repository
public interface ClientRepo extends ReactiveMongoRepository<Client, String>{

}
