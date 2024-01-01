package com.mongodb.tutorial.mongodbtutorial.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.tutorial.mongodbtutorial.model.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
	@Query("{'name':?0}")
	Optional<Expense> findByName(String name);

}
