package org.edu.fabs;

import org.edu.fabs.facade.Facade;
import org.edu.fabs.singleton.SingletonEager;
import org.edu.fabs.singleton.SingletonLazy;
import org.edu.fabs.singleton.SingletonLazyHolder;
import org.edu.fabs.strategy.Comportamento;
import org.edu.fabs.strategy.ComportamentoAgressivo;
import org.edu.fabs.strategy.ComportamentoDefensivo;
import org.edu.fabs.strategy.ComportamentoNormal;
import org.edu.fabs.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        // design Pattern SINGLETON
        SingletonLazy lazy = SingletonLazy.getInstanciaDeleMesmo();
        System.out.println(lazy); // endereco de memoria: org.edu.fabs.singleton.SingletonLazy@251a69d7
        lazy = SingletonLazy.getInstanciaDeleMesmo();
        System.out.println(lazy); // sera q retorna ele mesmo? org.edu.fabs.singleton.SingletonLazy@251a69d7

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager); // endereco de memoria: org.edu.fabs.singleton.SingletonEager@6b95977
        eager = SingletonEager.getInstancia();
        System.out.println(eager); // sera q retorna ele mesmo? org.edu.fabs.singleton.SingletonEager@6b95977

        SingletonLazyHolder holder = SingletonLazyHolder.getInstanciaDeleMesmo();
        System.out.println(holder); // endereco de memoria: org.edu.fabs.singleton.SingletonLazyHolder@58644d46
        holder = SingletonLazyHolder.getInstanciaDeleMesmo();
        System.out.println(holder); // sera q retorna ele mesmo? org.edu.fabs.singleton.SingletonLazyHolder@58644d46

        // Design Pattern STRATEGY
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        // criar robo
        Robo robo = new Robo();
        // atribuiu a estrategia de comportamento que da a caracteristica d emovimentacao do robo
        robo.setComportamento(normal);

        // pediu para ele se mover
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // design Pattern FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Joao", "14096");
        /* resultado: q a facade que tem a interface de uso simples, onde passo o nome cep,
        abstraia a complexidade de integracao api de cep e depois grave o cliente num sistema de crm
         */
    }

}