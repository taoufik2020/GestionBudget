package com.kripton.gestionbudget.Interface;

import java.util.Collection;

import com.kripton.gestionbudget.entities.Budget;

public interface BudgetInterface {
	public Collection<Budget> getAll();
	public void Supprimer (Integer id_budget);
	public Budget Ajouter(Budget budget);
	public Budget Edit(Budget budget);

}
