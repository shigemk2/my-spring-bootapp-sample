package com.shigemk2.libro.bootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private MyMongoRepository mongoRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mongoRepository.deleteAll();
        mongoRepository.save(new MongoData("hello", "this is sample memo."));
        mongoRepository.save(new MongoData("check!", "check sample code..."));
        mongoRepository.save(new MongoData("サンプルメモ", "これはサンプルのメモです"));
    }
}
