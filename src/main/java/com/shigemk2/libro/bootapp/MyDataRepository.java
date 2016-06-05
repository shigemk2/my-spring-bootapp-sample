package com.shigemk2.libro.bootapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyDataRepository
        extends JpaRepository<MyData, Integer> {

    public List<MyData> findByName(String name);
}
