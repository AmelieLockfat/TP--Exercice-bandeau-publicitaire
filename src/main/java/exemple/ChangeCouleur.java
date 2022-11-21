package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class ChangeCouleur extends Effet {
    public Color couleurF;
    public Color couleurB;

    public ChangeCouleur( Color couleurF, Color couleurB) {
        this.couleurF = couleurF;
        this.couleurB = couleurB;
    }

    public void executer(Bandeau Bd){
        Bd.setForeground(couleurF);
        Bd.sleep(500);
        Bd.setBackground(couleurB);
        Bd.sleep(500);
    }


}
