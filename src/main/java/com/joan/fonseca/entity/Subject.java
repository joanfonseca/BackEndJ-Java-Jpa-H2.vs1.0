package com.joan.fonseca.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject implements Serializable {

	private static final long serialVersionUID = 6141485623272457025L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_subject;
	private String name_subject;
	private Long id_teacher;
	private Long id_course;

	public Subject() {

	}

	public Subject(String name, Long id_teacher, Long id_course) {
		super();
		this.name_subject = name;
		this.id_teacher = id_teacher;
		this.id_course = id_course;
	}

	/**
	 * setters and getters
	 */
	public String getName() {
		return name_subject;
	}

	public void setName(String name) {
		this.name_subject = name;
	}

	public Long getId_subject() {
		return id_subject;
	}

	public Long getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(Long id_teacher) {
		this.id_teacher = id_teacher;
	}

	public Long getId_course() {
		return id_course;
	}

	public void setId_course(Long id_course) {
		this.id_course = id_course;
	}

	@Override
	public String toString() {
		return "Subject [id_subject=" + id_subject + ", name=" + name_subject + ", teacher=" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_subject == null) ? 0 : id_subject.hashCode());
		result = prime * result + ((name_subject == null) ? 0 : name_subject.hashCode());
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
		Subject other = (Subject) obj;
		if (id_subject == null) {
			if (other.id_subject != null)
				return false;
		} else if (!id_subject.equals(other.id_subject))
			return false;
		if (name_subject == null) {
			if (other.name_subject != null)
				return false;
		} else if (!name_subject.equals(other.name_subject))
			return false;
		return true;
	}
}