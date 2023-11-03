package org.edu.fabs.singleton;

public class Main {
    public static void main(String[] args) {

        // testes relacionados ao Design Pattern Singleton
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
    }

}