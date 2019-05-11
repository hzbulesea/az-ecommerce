package com.svit.ecommerce.repository;

import com.svit.ecommerce.model.OrderProduct;
import com.svit.ecommerce.model.OrderProductPK;

import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called orderProductRepository
//CRUD refers Create, Read, Update, Delete
//This is the repository interface, this will be automatically implemented by Spring in a 
//bean with the same name with changing case The bean name will be orderProductRepository
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
	
}
