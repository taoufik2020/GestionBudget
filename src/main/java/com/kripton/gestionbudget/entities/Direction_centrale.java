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
public class Direction_centrale implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 739921167723925347L;

	@Id
	@GeneratedValue
	private Integer id_direction_centrale;
	
	private String libelle_direction_centrale;
	@ManyToOne
	@JoinColumn(name="id_pole")
	private Pole pole ;
	public Pole getPole() {
		return pole;
	}

	public void setPole(Pole pole) {
		this.pole = pole;
	}

	public List<Direction> getDirections() {
		return Directions;
	}

	public void setDirections(List<Direction> directions) {
		Directions = directions;
	}

	@OneToMany(mappedBy="direction_centrale", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Direction> Directions;

	public Direction_centrale(Integer id_direction_centrale, String libelle_direction_centrale) {
		super();
		this.id_direction_centrale = id_direction_centrale;
		this.libelle_direction_centrale = libelle_direction_centrale;
	}

	public Direction_centrale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_direction_centrale() {
		return id_direction_centrale;
	}

	public void setId_direction_centrale(Integer id_direction_centrale) {
		this.id_direction_centrale = id_direction_centrale;
	}

	public String getLibelle_direction_centrale() {
		return libelle_direction_centrale;
	}

	public void setLibelle_direction_centrale(String libelle_direction_centrale) {
		this.libelle_direction_centrale = libelle_direction_centrale;
	}
}
