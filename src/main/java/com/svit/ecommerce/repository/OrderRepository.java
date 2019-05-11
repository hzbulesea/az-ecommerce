package com.svit.ecommerce.repository;


import org.springframework.data.repository.CrudRepository;
import com.svit.ecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
