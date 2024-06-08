package one.digitalinnovation.gof.strategy;

public class Teste {
    public static void main(String[] args) {
        Robo robo = new Robo();

        ComportamentoNormal comportamentoNormal       = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();

        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoDefensivo);
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
