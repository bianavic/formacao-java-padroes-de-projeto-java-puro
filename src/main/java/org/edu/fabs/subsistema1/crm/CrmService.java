package org.edu.fabs.subsistema1.crm;

public class CrmService {

    // garantir q quem consumir a classe nem sempre consome metodo estatico, consumindo sem necessidade
    private CrmService() {
        super();
    }

    // interface de uso
    public static void gravarCliente(String nome, String cep,  String cidade, String estado) {
        System.out.println("cliente salvo no sistema de CRM: ");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
