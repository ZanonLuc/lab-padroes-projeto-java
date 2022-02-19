package one.digitalinnovation.gof.strategy;

public class ComportamenteAgressivo implements Comportamento{

    @Override
    public void mover() {

        System.out.println ("Movendo-se agressivamente...");
    }


}
