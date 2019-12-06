package com.bdd.meatappapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
