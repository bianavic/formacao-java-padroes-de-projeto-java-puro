package org.edu.fabs.facade;

import org.edu.fabs.subsistema1.crm.CrmService;
import org.edu.fabs.subsistema2.cep.CepApi;

public class Facade {

    // quero migrar uma base de clientes, ou adicionar
    // consome api do cep e consolida infos do cep

    // criando interface de uso do facade para integrar com subsistemas
    // - buscar infos dos clientes no crm e cep
    public void migrarCliente(String nome, String cep) {

        // como buscar cidade e estado se nao temos no CRM? com o CepApi
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
