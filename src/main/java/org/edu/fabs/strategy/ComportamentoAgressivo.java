package org.edu.fabs.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("movendo-se agressivamente...");
    }

}
