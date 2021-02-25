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

import com.kripton.gestionbudget.Interface.Centre_responsabiliteInterface;
import com.kripton.gestionbudget.entities.Centre_responsabilite;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/centreResponsabilite")
public class Centre_responsabiliteController {

	@Autowired
	private Centre_responsabiliteInterface centre_responsabiliteInterface;
	
	@PostMapping("/add")
	public Centre_responsabilite ajoutCentreResponsabilite(@RequestBody Centre_responsabilite c) {
		if(c != null) {
			return centre_responsabiliteInterface.Add(c);
		}
		return null;
	}
	@GetMapping("/getAll")
	public Collection<Centre_responsabilite> getListCentre(){
		
		return centre_responsabiliteInterface.getAll();
		
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteCentreResponsabilite(@PathVariable Integer id) {
		
		centre_responsabiliteInterface.Delete(id);
		
	}
	@PutMapping("/modifier")
	public Centre_responsabilite modifierCentreResponsabilite(@RequestBody Centre_responsabilite c) {
		return centre_responsabiliteInterface.Edit(c); 
	}
	
	
}
