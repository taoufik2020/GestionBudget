package com.kripton.gestionbudget.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kripton.gestionbudget.Interface.Centre_responsabiliteInterface;
import com.kripton.gestionbudget.Repository.Centre_responsabiliteRepository;
import com.kripton.gestionbudget.entities.Centre_responsabilite;

@Service
public class Centre_responsabiliteService implements Centre_responsabiliteInterface {

	@Autowired
	private Centre_responsabiliteRepository centre_responsabiliteRepository;
	
	@Override
	public Collection<Centre_responsabilite> getAll() {
		// TODO Auto-generated method stub
		return centre_responsabiliteRepository.findAll();
	}

	@Override
	public void supprimer(Integer id_centre_responsabilite) {
		// TODO Auto-generated method stub
		centre_responsabiliteRepository.deleteById(id_centre_responsabilite);
	}

	@Override
	public Centre_responsabilite ajouter(Centre_responsabilite c) {
		// TODO Auto-generated method stub
		return centre_responsabiliteRepository.save(c);
	}

	@Override
	public Centre_responsabilite Edit(Centre_responsabilite c) {
		// TODO Auto-generated method stub
		Integer id = c.getId_centre_responsabilite();
		Centre_responsabilite centre_responsabilite = centre_responsabiliteRepository.getOne(id);
		centre_responsabilite.setLibelle_centre_responsabilite(c.getLibelle_centre_responsabilite());
		return centre_responsabiliteRepository.save(centre_responsabilite);
	}

	@Override
	public Centre_responsabilite getId( Integer id_centre_responsabilite) {
		// TODO Auto-generated method stub
		return centre_responsabiliteRepository.getOne(id_centre_responsabilite);
	}

}
