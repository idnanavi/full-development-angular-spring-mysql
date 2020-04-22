package com.backend.myapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter @Setter @NoArgsConstructor
@Table(name = "employee")
public class Employee {
	@Id
	private int id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name="email")
	private String email;
}
