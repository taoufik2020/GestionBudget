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
public class Direction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7242903977221994887L;
	@Id
	@GeneratedValue
	private Integer id_direction ;
	@ManyToOne
	@JoinColumn(name="id_direction_centrale")
	private Direction_centrale direction_centrale ;
	public Direction_centrale getDirection_centrale() {
		return direction_centrale;
	}
	public void setDirection_centrale(Direction_centrale direction_centrale) {
		this.direction_centrale = direction_centrale;
	}
	public List<Centre_responsabilite> getCentres_responsabilite() {
		return centres_responsabilite;
	}
	public void setCentres_responsabilite(List<Centre_responsabilite> centres_responsabilite) {
		this.centres_responsabilite = centres_responsabilite;
	}
	@OneToMany(mappedBy="direction", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Centre_responsabilite> centres_responsabilite;
	public Direction(Integer id_direction, String libelle_direction) {
		super();
		this.id_direction = id_direction;
		this.libelle_direction = libelle_direction;
	}
	public Direction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_direction() {
		return id_direction;
	}
	public void setId_direction(Integer id_direction) {
		this.id_direction = id_direction;
	}
	public String getLibelle_direction() {
		return libelle_direction;
	}
	public void setLibelle_direction(String libelle_direction) {
		this.libelle_direction = libelle_direction;
	}
	private String libelle_direction;
}
