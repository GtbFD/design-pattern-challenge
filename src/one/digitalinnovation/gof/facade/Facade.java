package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema.dois.cep.CepAPI;
import one.digitalinnovation.gof.subsistema.um.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        CepAPI cepAPI = CepAPI.getInstance();
        String cidade = cepAPI.recuperarCidade(cep);
        String estado = cepAPI.recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
