package com.kripton.gestionbudget.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Type_centre_responsabilite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4557084759526267602L;

	@Id
	@GeneratedValue
	private Integer id_type_centre_responsabilite;
	
	private String libelle_type_centre_responsabilite;
	@OneToMany(mappedBy="type_centre_responsabilite", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Centre_responsabilite> centres_responsabilite;

	public Type_centre_responsabilite(Integer id_type_centre_responsabilite,
			String libelle_type_centre_responsabilite) {
		super();
		this.id_type_centre_responsabilite = id_type_centre_responsabilite;
		this.libelle_type_centre_responsabilite = libelle_type_centre_responsabilite;
	}

	public Type_centre_responsabilite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_type_centre_responsabilite() {
		return id_type_centre_responsabilite;
	}

	public void setId_type_centre_responsabilite(Integer id_type_centre_responsabilite) {
		this.id_type_centre_responsabilite = id_type_centre_responsabilite;
	}

	public String getLibelle_type_centre_responsabilite() {
		return libelle_type_centre_responsabilite;
	}

	public void setLibelle_type_centre_responsabilite(String libelle_type_centre_responsabilite) {
		this.libelle_type_centre_responsabilite = libelle_type_centre_responsabilite;
	}
}
