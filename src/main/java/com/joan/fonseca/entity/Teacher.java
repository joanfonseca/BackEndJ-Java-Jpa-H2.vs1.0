package com.joan.fonseca.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {

	private static final long serialVersionUID = 6593366879388584303L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_teacher;

	private String name_teacher;

	public Teacher() {

	}

	public Teacher(String name_teacher) {
		super();
		this.name_teacher = name_teacher;
	}

	/**
	 * setters and getters
	 */

	public String getName() {
		return name_teacher;
	}

	public void setName(String name_teacher) {
		this.name_teacher = name_teacher;
	}

	public Long getId_teacher() {
		return id_teacher;
	}

	@Override
	public String toString() {
		return "Teacher [id_teacher=" + id_teacher + ", name_teacher=" + name_teacher + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_teacher == null) ? 0 : id_teacher.hashCode());
		result = prime * result + ((name_teacher == null) ? 0 : name_teacher.hashCode());
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
		Teacher other = (Teacher) obj;
		if (id_teacher == null) {
			if (other.id_teacher != null)
				return false;
		} else if (!id_teacher.equals(other.id_teacher))
			return false;
		if (name_teacher == null) {
			if (other.name_teacher != null)
				return false;
		} else if (!name_teacher.equals(other.name_teacher))
			return false;
		return true;
	}
}