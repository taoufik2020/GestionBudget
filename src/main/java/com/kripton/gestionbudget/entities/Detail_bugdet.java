package com.kripton.gestionbudget.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Detail_bugdet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8475912753559572400L;

	@Id
	@GeneratedValue
	private Integer id_detail_budget;
	
	private float montant_detail_budget;
	@ManyToOne
	@JoinColumn(name="id_budget")
	private Budget budget ;
	@ManyToOne
	@JoinColumn(name="id_rubrique")
	private Rubrique_budget rubrique_budget ;

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	public Rubrique_budget getRubrique_budget() {
		return rubrique_budget;
	}

	public void setRubrique_budget(Rubrique_budget rubrique_budget) {
		this.rubrique_budget = rubrique_budget;
	}

	public Detail_bugdet(Integer id_detail_budget, float montant_detail_budget) {
		super();
		this.id_detail_budget = id_detail_budget;
		this.montant_detail_budget = montant_detail_budget;
	}

	public Detail_bugdet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_detail_budget() {
		return id_detail_budget;
	}

	public void setId_detail_budget(Integer id_detail_budget) {
		this.id_detail_budget = id_detail_budget;
	}

	public float getMontant_detail_budget() {
		return montant_detail_budget;
	}

	public void setMontant_detail_budget(float montant_detail_budget) {
		this.montant_detail_budget = montant_detail_budget;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
