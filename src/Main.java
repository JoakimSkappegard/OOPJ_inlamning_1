//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private ArrayList<Vaxt> klientLista;
    private Kaktus exempelKaktus = new Kaktus(1.0, "Exempelkaktus9999999", false);
    private Palm exempelPalm = new Palm(1.0, "ExempelPalm9999999", false);
    private Kottatandevaxt exempelKottatandevaxt = new Kottatandevaxt(1.,"ExempelKöttätandeväxt9999999", false);

    Main() {
        klientLista = new ArrayList<>();
        korDemo();

        while (true){
            String sokNamn=JOptionPane.showInputDialog(null,"Skriv in namnet på växten som ska vattnas.");
            if (sokNamn==null){
                break;
            }
            else {
                for (int i = 0; i < klientLista.size(); i++) {
                    if(klientLista.get(i).getVaxtName().equals(sokNamn.toUpperCase().trim())){
                        if(true==klientLista.get(i).getGastState()){
                            JOptionPane.showMessageDialog(null,"Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                        }
                        else if (false==klientLista.get(i).getGastState()) {
                            int val = JOptionPane.showConfirmDialog(null, sokNamn.toUpperCase().trim() + " är för närvarande inte registrerad som boende på hotellet.\nVill du lägga in " + sokNamn.toUpperCase().trim() +" som aktiv gäst i systemet?", "",JOptionPane.YES_NO_OPTION);
                            if(val==JOptionPane.YES_OPTION){
                                klientLista.get(i).sattGastState(true);
                                JOptionPane.showMessageDialog(null,"Växten \"" + sokNamn.toUpperCase().trim() + "\"  behöver " + klientLista.get(i).behov() + " liter " + klientLista.get(i).vattskaBehov().vattska);
                            }
                            else if (val == -1) {
                                System.exit(0);
                            }
                            else {
                                continue;
                            }
                        }
                        else if (i==klientLista.size()-1) {
                            JOptionPane.showMessageDialog(null, "Växten du sökte vid namn \"" + sokNamn.toUpperCase().trim() + "\" kunde inte hittas i programmet.\nDetta kan antingen bero på att fel namn angetts eller så saknas det i registret.\nOm ni inte kan hitta plantan ni söker så behöver en:\nPalm " + exempelPalm.behov() + " liter " + exempelPalm.vattskaBehov().vattska + " per meter.\nKaktus " + exempelKaktus.behov() + " liter " + exempelKaktus.vattskaBehov().vattska + ". OBS oavsett längd på planta!\nKöttätandeväxt " + exempelKottatandevaxt.behov() + " liter " + exempelKottatandevaxt.vattskaBehov().vattska + " per meter.");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
    public void korDemo(){
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
        /*
        Två val:
        vilken växt ska få vätska?

        lägg till växt.

        VVSFV
            ska läsa in växtnamn
            (hade även varit snyggt att lägga till så att man kan välja växt ur lista, överkurs)

                ska pressentera överst tydligt vängd vatten/mineral/protein växten ska ha.
                Jag vill även att växtens övriga information presenteras under

                snyggare om detta loopar så att man kan komma till väljväxt/huvudmeny igen

         Lägg till växt
            behöver ta in namn, höjd och typ av växt.
            !! kan man inplementera polymorfism här??

            behöver vara säkert vid felaktig inmatning.

         Programet behöver på något sätt lägga in objekten i en lista som man sedan kan söka av för att hitta all info.
         Bör den listan ligga i main? eller ha en egen klass?
         snyggast hade varit ifall de låg i en fil utanför programet och sparades/lästes av (istället för en databank) men det är lite överkurs och jag har inte riktigt tid.

         Behöver kolla upp:
         ENUMS

         Behöver dubbelkolla:
         Interface
         Polymorfism

         Klasser

         växter tänker jag ska vara en abstrakt klass
         den ska innehålla längden på växten för det är en variabel som bör vara gemensam för alla växter.
         konstructor
         metod för att hämnta variabel
         metod för att sätta variabel

         pal
         variabel för vatten/längd
         metod för att räkna ut vatten behov
         metod hämnta vatten/längd
         metod sätta vatten/längnd

         kakt
         var minvatt/dag
         hämnta minvat/dag
         sättaminvatt/dag

         kottvaxt
         var protdryck/lägnd
         metod räkna behov
         metod hämnta
         metod sätta

         inteface farlig
         bool gifitg
         bool taggig
         bool övrig fara
         string giftig
         string taggig
         string övrig



         */


/*
vilken växt (tar namn)
    kollar i lista
    om den finns

    om ja
        out växtnamn+behov

    om nej
        växt ej på hotell

    om cancle
        hantera null


******************************************************************************************************************************
lagra växter i en fil (databas)

hantera samma namn

bara se närvarande växter




 */

