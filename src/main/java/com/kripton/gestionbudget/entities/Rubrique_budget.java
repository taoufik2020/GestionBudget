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
public class Rubrique_budget implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8565695200265952763L;
	
	public Rubrique_budget(Integer id_rubrique, String libelle_rubrique, String sens) {
		super();
		this.id_rubrique = id_rubrique;
		this.libelle_rubrique = libelle_rubrique;
		this.sens = sens;
	}

	public Rubrique_budget() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_rubrique() {
		return id_rubrique;
	}

	public void setId_rubrique(Integer id_rubrique) {
		this.id_rubrique = id_rubrique;
	}

	public String getLibelle_rubrique() {
		return libelle_rubrique;
	}

	public void setLibelle_rubrique(String libelle_rubrique) {
		this.libelle_rubrique = libelle_rubrique;
	}

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	@Id
	@GeneratedValue
	private Integer id_rubrique;
	
	public List<Detail_bugdet> getDetails_budget() {
		return details_budget;
	}

	public void setDetails_budget(List<Detail_bugdet> details_budget) {
		this.details_budget = details_budget;
	}

	private String libelle_rubrique;
	
	private String sens;
	@OneToMany(mappedBy="rubrique_budget", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Detail_bugdet> details_budget;
	

}
