package com.relation.repository;

import com.relation.dto.OrderResponse;
import com.relation.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT c.name,p.productName FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
