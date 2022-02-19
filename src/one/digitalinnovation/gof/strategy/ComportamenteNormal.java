package one.digitalinnovation.gof.strategy;

public class ComportamenteNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println ("Movendo-se normalmente...");
    }


}
