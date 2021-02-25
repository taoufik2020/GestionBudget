package com.kripton.gestionbudget.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kripton.gestionbudget.Interface.BudgetInterface;
import com.kripton.gestionbudget.entities.Budget;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/budget")
public class BudgetController {
	@Autowired
	BudgetInterface budgetinterface ;
	
	@GetMapping("/getAll")
	Collection<Budget> getListBudget(){
		
		return  budgetinterface.getAll();
		
	}
	@PostMapping("/add")
	public Budget ajouterBudget(@RequestBody Budget budget) {
		if(budget !=null) {
			return budgetinterface.Ajouter(budget);
		}
		return null;
	}
	@DeleteMapping("/delete/{id}")
	public void supprimerBudget(@PathVariable Integer id) {
		budgetinterface.Delete(id);
	}
	@PutMapping("/modifier")
	public Budget modifierBudget(@RequestBody Budget budget) {
		return budgetinterface.Edit(budget);
	}

}
