package one.digitalinnovation.gof.strategy;

// Aplicar o movimento do robo, usando conceitos de Strategy.

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover() {
        comportamento.mover ();
    }
}

