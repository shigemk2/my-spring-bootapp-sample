package com.shigemk2.libro.bootapp;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MyMongoRepository
extends MongoRepository<MongoData, String> {
    public List<MongoData> findByTitle(String title);
}
