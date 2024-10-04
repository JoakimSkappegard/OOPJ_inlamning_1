import javax.swing.*;

public class Kaktus extends Vaxt{

    protected Vattskor vattska= Vattskor.MINERALVATTEN;

    private static final double kaktusBehovDag = 0.2;

    private boolean gastState;


    public Kaktus (double hojd, String namn, boolean gastState) {
        super(hojd, namn);
        this.gastState = gastState;
    }


    @Override
    public void sattGastState(boolean state) {
        gastState = state;
    }

    @Override
    public boolean getGastState() {
        return gastState;
    }

    @Override
    public double behov() {
        return kaktusBehovDag;
    }

    @Override
    public Vattskor vattskaBehov() {
        return vattska;
    }
}
