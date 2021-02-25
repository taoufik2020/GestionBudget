package com.kripton.gestionbudget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kripton.gestionbudget.entities.Centre_responsabilite;

public interface Centre_responsabiliteRepository extends JpaRepository<Centre_responsabilite, Integer> {

	//public Centre_responsabilite  findByid_centre_responsabilite(Integer id_centre_responsabilite);
}
