package org.edu.fabs.strategy;

// criando o contexto
public class Robo {


    // possui o atributo do tipo da interface - (polimorfismo)
    private Comportamento comportamento;

    // o robo podera modificar a estrategia de comportamento dele
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    // garantir que consegue fazer o robo se mover
    public void mover() {
        // delega a responsabilidade de movimentacao para nossa strategy
        comportamento.mover();
    }


//    private Comportamento strategy;
//    public void setStrategy(Comportamento strategy) {
//        this.strategy = strategy;
//    }

}
