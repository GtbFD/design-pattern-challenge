package one.digitalinnovation.gof.subsistema.dois.cep;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){}

    public static CepAPI getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
