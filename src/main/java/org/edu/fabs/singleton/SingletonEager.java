package org.edu.fabs.singleton;

/**
 * singleton apressado
 * ao inves de verificar:
 *         if (instanciaDeleMesmo == null) {
 *             instanciaDeleMesmo = new SingletonLazy();
 *         }
 * no momento que a variavel estatica é definida, ele ja atribui a instancia
 */
public class SingletonEager {

    // no momento que a classe for acionada por alguem, a instancia ja é atribuida
    // e qdo for chamada ela ja estara pronta para ser retornada
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
