import javax.swing.*;

public class Palm extends Vaxt{

    private static final double palmBehovDag = 0.5;

    private boolean gastState;

    private Vattskor vattska= Vattskor.KRANVATTEN;


    @Override
    public void sattGastState(boolean state) {
        gastState = state;
    }

    @Override
    public boolean getGastState() {
        return gastState;
    }

    public Palm (double hojd, String namn, boolean gastState) {
        super(hojd, namn);
        this.gastState = gastState;
    }

    @Override
    public double behov() {
        return (this.getVaxtHojd()* palmBehovDag);
    }

    @Override
    public Vattskor vattskaBehov() {
        return vattska;
    }
    //saknar vilkorslös konstruktor.
}
