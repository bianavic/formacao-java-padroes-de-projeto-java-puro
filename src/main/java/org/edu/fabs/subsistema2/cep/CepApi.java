package org.edu.fabs.subsistema2.cep;

public class CepApi {

    // aplicando singleton para a api servcie
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super(); //
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "santo andre";
    }
    public String recuperarEstado(String cep) {
        return "SP";
    }

}
