package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.OrderedCartItems;
import com.entity.Product;
 
@Repository
public interface OrderedCartItemsRepository extends JpaRepository<OrderedCartItems, Integer> {
	public  List<OrderedCartItems> findByProduct(Product product);
}
