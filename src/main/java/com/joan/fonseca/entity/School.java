package com.joan.fonseca.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schools")
public class School implements Serializable {

	private static final long serialVersionUID = 7034168760707886125L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_school;

	private String name_school;

	public School() {
	}

	public School(Long id_school, String name) {
		super();
		this.name_school = name;
		this.id_school = id_school;
	}

	/**
	 * setters and getters
	 */
	public String getName() {
		return name_school;
	}

	public void setName(String name) {
		this.name_school = name;
	}

	public Long getId_school() {
		return id_school;
	}

	@Override
	public String toString() {
		return "School [id_school=" + id_school + ", name=" + name_school + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_school == null) ? 0 : id_school.hashCode());
		result = prime * result + ((name_school == null) ? 0 : name_school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (id_school == null) {
			if (other.id_school != null)
				return false;
		} else if (!id_school.equals(other.id_school))
			return false;
		if (name_school == null) {
			if (other.name_school != null)
				return false;
		} else if (!name_school.equals(other.name_school))
			return false;
		return true;
	}
}