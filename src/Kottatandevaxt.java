import javax.swing.*;

public class Kottatandevaxt extends Vaxt{

    protected Vattskor vattska= Vattskor.PROTEINDRYCK;

    private static final double kottatandevaxtBehovDag = 0.2;

    private boolean gastState;

    @Override
    public void sattGastState(boolean state) {
        gastState = state;
    }

    @Override
    public boolean getGastState() {
        return gastState;
    }

    public Kottatandevaxt (double hojd, String namn, boolean gastState) {
        super(hojd, namn);
        this.gastState = gastState;
    }

    @Override
    public double behov() {
        return (this.getVaxtHojd()*kottatandevaxtBehovDag);
    }

    @Override
    public Vattskor vattskaBehov() {
        return vattska;
    }
}
