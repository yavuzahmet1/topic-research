package com.mongodb.tutorial.mongodbtutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.tutorial.mongodbtutorial.model.Expense;
import com.mongodb.tutorial.mongodbtutorial.repository.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;

	@Autowired
	public ExpenseService(ExpenseRepository expenseRepository) {
		super();
		this.expenseRepository = expenseRepository;
	}

	public void addExpense(Expense expense) {
		expenseRepository.insert(expense);

	}

	public void updateExpense(Expense expense) {
		Expense savedExpense = expenseRepository.findById(expense.getId()).orElseThrow(
				() -> new RuntimeException(String.format("Can not Find Expense by ID %s", expense.getId())));

		savedExpense.setExpenseName(expense.getExpenseName());
		savedExpense.setExpenseCategory(expense.getExpenseCategory());
		savedExpense.setExpenseAmount(expense.getExpenseAmount());

		expenseRepository.save(expense);
	}

	public List<Expense> getAllExpense() {
		return expenseRepository.findAll();

	}

	public Expense getExpenseByName(String name) {
		return expenseRepository.findByName(name)
				.orElseThrow(() -> new RuntimeException(String.format("Can not Find Expense by ID %s", name)));
	}

	public void deleteExpense(String id) {
		expenseRepository.deleteById(id);
		;

	}
}
