package com.appRH.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Indicia que esta classe é uma identidade JPA
@Table(name="funcionarios") //Nome da tabela no banco de dados

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String cpf;
	
	@Enumerated(EnumType.STRING) // Indica que o enum será salvo como uma string no banco de dados
	@Column(nullable = false)
	private PositionEnum position;
	
	@Enumerated(EnumType.STRING) // Use @Enumerated para armazenar o enum como uma string
	@Column(nullable = false)
	private DepartamentEnum departament; //Instância do Enum departament
	
	private LocalDate dataAdmissao;
	private String email;
	private String phoneNumber;
	private boolean active;
	
	public Employee() {}

	public Employee(String name, String cpf, PositionEnum position, DepartamentEnum departament, LocalDate dataAdmissao,
			String email, String phoneNumber, boolean active) {
		this.name = name;
		this.cpf = cpf;
		this.position = position;
		this.departament = departament;
		this.dataAdmissao = dataAdmissao;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PositionEnum getPosition() {
		return position;
	}

	public void setPosition(PositionEnum position) {
		this.position = position;
	}

	public DepartamentEnum getDepartament() {
		return departament;
	}

	public void setDepartament(DepartamentEnum departament) {
		this.departament = departament;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
	
}
