package org.edu.fabs.singleton;

/**
 * singleton preguicoso
 * num primeiro momento ele ja nao disponibiliza a instancia parao usuario
 * para isso criamos uma instancia dele mesmo
 */

public class SingletonLazy {

    private static SingletonLazy instanciaDeleMesmo;

    // garantir que ninguem externamente consiga instancia-la -> criando construtor PRIVADO
    private SingletonLazy() {
        super(); //
    }

    // metodo para expor de maneira publica
    public static SingletonLazy getInstanciaDeleMesmo() {
        // precisa prepara-la para ser instanciada
        if (instanciaDeleMesmo == null) {
            instanciaDeleMesmo = new SingletonLazy();
        }
        return instanciaDeleMesmo;
    }

}
