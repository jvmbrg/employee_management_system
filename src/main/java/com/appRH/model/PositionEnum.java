package com.appRH.model;

public enum PositionEnum {
    ENFERMEIRO("Enfermeiro", 2500.00),
    TECNICO_ENFERMAGEM("Técnico de Enfermagem", 1800.00),
    ESTAGIARIO("Estagiário", 900.00);

    private final String name;
    private final double salary;

    // Construtor do enum precisa ser private
    private PositionEnum(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

