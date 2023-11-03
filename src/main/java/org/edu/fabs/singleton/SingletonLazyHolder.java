package org.edu.fabs.singleton;

/**
 * Singleton Lazy Holder -> encapsula a instancia em uma classe estatita
 * vantagens: consumo e custo de memoria + otimizado -> thread safe
 * (contem conceito de static factory, lazy initialization e thread safe)
 *
 */

public class SingletonLazyHolder {

    // holder: pq ele encapsula a instancia em uma CLASSE ESTATICA INTERNA - inner class

    private static class InstanceHolder {
        // unica funcao é encapsular a instancia
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    // metodo para expor de maneira publica
    public static SingletonLazyHolder getInstanciaDeleMesmo() {
        // ao inves de acessa-la de forma direta, acessa pelo Holder
        return InstanceHolder.instancia;
    }

}
