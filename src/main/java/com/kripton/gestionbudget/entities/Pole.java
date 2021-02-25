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
public class Pole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8290200546720924800L;
	
	@Id
	@GeneratedValue
	private Integer id_pole;
	
	public List<Direction_centrale> getDirections_centrale() {
		return Directions_centrale;
	}

	public void setDirections_centrale(List<Direction_centrale> directions_centrale) {
		Directions_centrale = directions_centrale;
	}

	private String libelle_pole;
	@OneToMany(mappedBy="pole", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Direction_centrale> Directions_centrale;

	public Integer getId_pole() {
		return id_pole;
	}

	public Pole(Integer id_pole, String libelle_pole) {
		super();
		this.id_pole = id_pole;
		this.libelle_pole = libelle_pole;
	}

	public Pole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId_pole(Integer id_pole) {
		this.id_pole = id_pole;
	}

	public String getLibelle_pole() {
		return libelle_pole;
	}

	public void setLibelle_pole(String libelle_pole) {
		this.libelle_pole = libelle_pole;
	}

}
