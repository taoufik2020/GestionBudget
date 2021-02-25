package com.kripton.gestionbudget.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kripton.gestionbudget.Interface.BudgetInterface;
import com.kripton.gestionbudget.Repository.BudgetRepository;
import com.kripton.gestionbudget.entities.Budget;

@Service
public class BudgetService implements BudgetInterface {

	@Autowired
	BudgetRepository budgetrepository;
	@Override
	public Collection<Budget> getAll() {
		// TODO Auto-generated method stub
		return budgetrepository.findAll();
	}

	@Override
	public void Delete(Integer id_budget) {
		// TODO Auto-generated method stub
		budgetrepository.deleteById(id_budget);
	}

	@Override
	public Budget Ajouter(Budget budget) {
		// TODO Auto-generated method stub
		return budgetrepository.save(budget);
	}

	@Override
	public Budget Edit(Budget budget) {

		Integer id = budget.getId_budget();
		Budget b = budgetrepository.getOne(id);
		b.setLibelle_budget(budget.getLibelle_budget());
		b.setMontant_total(budget.getMontant_total());
		b.setDate_budget(budget.getDate_budget());
		return budgetrepository.save(b);
	}

}
