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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity //Indicia que esta classe é uma identidade JPA
@Table(name="funcionarios") //Nome da tabela no banco de dados

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome",nullable = false, length = 100) //Nome do funcionario, não nulo e com tamanho igual a 100
	private String name;
	
	@Column(nullable = false, unique = true, length = 14) //CPF unico, não nulo e com tamanho de 14 caracteres
	private String cpf;
	
	@Enumerated(EnumType.STRING) // Indica que o enum será salvo como uma string no banco de dados
	@Column(name = "cargo",nullable = false)
	private PositionEnum position;
	
	@Enumerated(EnumType.STRING) // Use @Enumerated para armazenar o enum como uma string
	@Column(name="departamento",nullable = false)
	private DepartamentEnum departament; //Instância do Enum departament
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_admissao")
	private LocalDate dataAdmissao;
	
	@Column(length = 100)
	private String email;
	
	@Column(name="telefone", length= 15)
	private String phoneNumber;
	
	@Column(name="status_atividade")
	private boolean active;
	
	public Employee() {}

	public Employee(String name, String cpf, PositionEnum position, DepartamentEnum departament, LocalDate dataAdmissao,
			String email, String phoneNumber) {
		this.name = name;
		this.cpf = cpf;
		this.position = position;
		this.departament = departament;
		this.dataAdmissao = dataAdmissao;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.active = true;
	}

	public int getId() {
		return id;
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

	public void updateData(String name, String phoneNumber, String email) {
		setName(name);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}
	
	public void updateStatus(DepartamentEnum departament, PositionEnum positionEnum) {
		setDepartament(departament);
		setPosition(positionEnum);
	}
	
	public void deactivateEmployee() {
		this.active = false;
	}
	
	public void activateEmployee() {
		this.active = true;;
	}
	
	
}
