package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        monBandeau.setMessage("Bonjour");
        monBandeau.sleep(500);
        monBandeau.setBackground(Color.WHITE);
        monBandeau.setForeground(Color.PINK);
        monBandeau.sleep(500);
        monBandeau.setMessage("Je change de couleur, je tourne et je clignote.");
        ArrayList<Effet> Scen = new ArrayList<Effet>();
        ChangeCouleur ChC = new  ChangeCouleur(Color.BLACK, Color.BLUE);
        ChangeCouleur ChC2 = new  ChangeCouleur(Color.BLACK, Color.WHITE);
        ChangeCouleur ChC3 = new  ChangeCouleur(Color.PINK, Color.WHITE);
        ChangeRotation ChR1 =new ChangeRotation(25);
        Clignote Zoom1 = new Clignote();
        Scenario S= new Scenario ("Scenario 1", Scen);
        S.AjouteAuScenario(ChC,1);
        S.AjouteAuScenario(ChC3,1);
        S.AjouteAuScenario(ChC2,1);
        S.AjouteAuScenario(ChR1,12);
        S.AjouteAuScenario(ChC2,1);
        S.AjouteAuScenario(Zoom1,3);
        S.executerScenario(monBandeau);
        monBandeau.setRotation(0);
        monBandeau.setMessage(" c'est fini!");
        monBandeau.sleep(1000);
        monBandeau.setMessage("au revoir");
    }


}
