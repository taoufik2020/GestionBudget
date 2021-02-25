package com.kripton.gestionbudget.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Centre_responsabilite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3115990395025804604L;

	public Centre_responsabilite(Integer id_centre_responsabilite, String libelle_centre_responsabilite) {
		super();
		this.id_centre_responsabilite = id_centre_responsabilite;
		this.libelle_centre_responsabilite = libelle_centre_responsabilite;
	}

	public Centre_responsabilite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_centre_responsabilite() {
		return id_centre_responsabilite;
	}

	public void setId_centre_responsabilite(Integer id_centre_responsabilite) {
		this.id_centre_responsabilite = id_centre_responsabilite;
	}

	public String getLibelle_centre_responsabilite() {
		return libelle_centre_responsabilite;
	}

	public List<Budget> getBudgets() {
		return budgets;
	}

	public void setBudgets(List<Budget> budgets) {
		this.budgets = budgets;
	}

	public Type_centre_responsabilite getType_centre_responsabilite() {
		return type_centre_responsabilite;
	}

	public void setType_centre_responsabilite(Type_centre_responsabilite type_centre_responsabilite) {
		this.type_centre_responsabilite = type_centre_responsabilite;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setLibelle_centre_responsabilite(String libelle_centre_responsabilite) {
		this.libelle_centre_responsabilite = libelle_centre_responsabilite;
	}

	@Id
	@GeneratedValue
	private Integer id_centre_responsabilite ;
	
	private String libelle_centre_responsabilite;
	@OneToMany(mappedBy="centre_responsabilite", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Budget> budgets;
	@ManyToOne
	@JoinColumn(name="id_type_centre_responsabilite")
	private Type_centre_responsabilite type_centre_responsabilite ;
	@ManyToOne
	@JoinColumn(name="id_direction")
	private Direction direction ;

}
