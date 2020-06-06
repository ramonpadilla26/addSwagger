package com.uabc.edu.practica1.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Operacion implements Serializable {

    @Getter@Setter
    private double numeroA;
    @Getter@Setter
    private double numeroB;
    @Getter@Setter
    private double resultado;
    @Getter@Setter
    private OPERACIONES op;

}
