package one.digitalinnovation.gof.strategy;

public class ComportamenteDefensivo implements Comportamento{

    @Override
    public void mover() {

        System.out.println ("Movendo-se defensivamente...");
    }

    
}