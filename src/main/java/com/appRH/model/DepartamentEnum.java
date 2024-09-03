package com.appRH.model;

public enum DepartamentEnum {
	ENFERMARIA_1("Enfermaria 1"),
	ENFERMARIA_2("Enfermaria 2"),
	ENFERMARIA_3("Enfermaria 3"),
	UTI("UTI");
	
	private final String nameDepartament;
	
	private DepartamentEnum(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}
	
	public String getNameDepartament() {
		return nameDepartament;
	}
}
