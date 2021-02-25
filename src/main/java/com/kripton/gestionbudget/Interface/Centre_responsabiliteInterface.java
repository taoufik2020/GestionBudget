package com.kripton.gestionbudget.Interface;

import java.util.Collection;

import com.kripton.gestionbudget.entities.Centre_responsabilite;

public interface Centre_responsabiliteInterface {
	public Collection<Centre_responsabilite> getAll();
	public void supprimer (Integer id_centre_responsabilite);
	public Centre_responsabilite ajouter(Centre_responsabilite c);
	public Centre_responsabilite Edit(Centre_responsabilite c);
	public Centre_responsabilite getId(Integer id_centre_responsabilite);

}
