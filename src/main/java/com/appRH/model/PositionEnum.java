package com.appRH.model;

public enum PositionEnum {
    ENFERMEIRO("Enfermeiro"),
    TECNICO_ENFERMAGEM("Técnico de Enfermagem"),
    ESTAGIARIO("Estagiário"),
    FERIAS("Férias");
	

    private final String name;
    

    // Construtor do enum precisa ser private
    private PositionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

