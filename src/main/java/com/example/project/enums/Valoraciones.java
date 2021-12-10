package com.example.project.enums;

public enum Valoraciones {
    MALA(1),
    REGULAR(2),
    BUENA(3),
    MUY_BUENA(4),
    EXCELENTE(5);

    private final Integer valoracion;

    Valoraciones(Integer valoracion){
        this.valoracion = valoracion;
    }

    public Integer getValoracion() {
        return valoracion;
    }
}
