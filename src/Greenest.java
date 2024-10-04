//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.ArrayList;

public class Greenest {
    private ArrayList<Vaxt> klientLista;
    private Kaktus exempelKaktus = new Kaktus(1.0, "Exempelkaktus9999999", false);
    private Palm exempelPalm = new Palm(1.0, "ExempelPalm9999999", false);
    private Kottatandevaxt exempelKottatandevaxt = new Kottatandevaxt(1.,"ExempelKöttätandeväxt9999999", false);

    Greenest() {
        klientLista = new ArrayList<>();
        korDemo();

        while (true){
            System.out.println("Skriv in namnet på växten som ska vattnas.");
            String sokNamn=JOptionPane.showInputDialog(null,"Skriv in namnet på växten som ska vattnas.");
            if (sokNamn==null){
                break;
            }
            else {
                boolean vaxtHittad = false;
                for (int i = 0; i < klientLista.size(); i++) {
                    if(klientLista.get(i).getVaxtName().equals(sokNamn.toUpperCase().trim())){
                        vaxtHittad = true;
                        if(klientLista.get(i).getGastState()){
                            System.out.println("Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                            JOptionPane.showMessageDialog(null,"Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                        }
                        else if (!klientLista.get(i).getGastState()) {
                            System.out.println(sokNamn.toUpperCase().trim() + " är för närvarande inte registrerad som boende på hotellet.\nVill du lägga in " + sokNamn.toUpperCase().trim() +" som aktiv gäst i systemet?");
                            int val = JOptionPane.showConfirmDialog(null, sokNamn.toUpperCase().trim() + " är för närvarande inte registrerad som boende på hotellet.\nVill du lägga in " + sokNamn.toUpperCase().trim() +" som aktiv gäst i systemet?", "",JOptionPane.YES_NO_OPTION);
                            if(val==JOptionPane.YES_OPTION){
                                klientLista.get(i).sattGastState(true);
                                System.out.println("Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                                JOptionPane.showMessageDialog(null,"Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                            }
                            else if (val == -1) {
                                System.exit(0);
                            }
                        }
                    }
                    else if (i==klientLista.size()-1 && !vaxtHittad) {
                        System.out.println("Växten du sökte vid namn \"" + sokNamn.toUpperCase().trim() + "\" kunde inte hittas i programmet.\nDetta kan antingen bero på att fel namn angetts eller så saknas det i registret.\nOm ni inte kan hitta plantan ni söker så behöver en:\nPalm " + exempelPalm.behov() + " liter " + exempelPalm.vattskaBehov().vattska + " per meter.\nKaktus " + exempelKaktus.behov() + " liter " + exempelKaktus.vattskaBehov().vattska + ". OBS oavsett längd på planta!\nKöttätandeväxt " + exempelKottatandevaxt.behov() + " liter " + exempelKottatandevaxt.vattskaBehov().vattska + " per meter.");
                        JOptionPane.showMessageDialog(null, "Växten du sökte vid namn \"" + sokNamn.toUpperCase().trim() + "\" kunde inte hittas i programmet.\nDetta kan antingen bero på att fel namn angetts eller så saknas det i registret.\nOm ni inte kan hitta plantan ni söker så behöver en:\nPalm " + exempelPalm.behov() + " liter " + exempelPalm.vattskaBehov().vattska + " per meter.\nKaktus " + exempelKaktus.behov() + " liter " + exempelKaktus.vattskaBehov().vattska + ". OBS oavsett längd på planta!\nKöttätandeväxt " + exempelKottatandevaxt.behov() + " liter " + exempelKottatandevaxt.vattskaBehov().vattska + " per meter.");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Greenest main = new Greenest();
    }
    public void korDemo(){
        System.out.println("Vill du ladda in demoprogram.");
        int confirmDemo = JOptionPane.showConfirmDialog(null, "Vill du ladda in demoprogram.", "", JOptionPane.YES_NO_OPTION);
        if (confirmDemo == JOptionPane.YES_OPTION) {
            Kaktus kaktusIgge = new Kaktus(0.20, "Igge", true);
            this.klientLista.add(kaktusIgge);
            Palm palmLaura = new Palm(5.0, "Laura", true);
            this.klientLista.add(palmLaura);
            Kottatandevaxt kottatandevaxtMeatloaf = new Kottatandevaxt(0.7,"Meatloaf", true);
            this.klientLista.add(kottatandevaxtMeatloaf);
            Palm palmOlof = new Palm(1.0, "Olof", false);
            this.klientLista.add(palmOlof);
        }
    }
}


