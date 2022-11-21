package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignote extends Effet {

    public Clignote() {
    }
    public void executer(Bandeau Bd){
       Color B= Bd.getBackground();
       Color C = Bd.getForeground();
       Bd.setForeground(B);
       Bd.sleep(100);
       Bd.setForeground(C);
       Bd.sleep(100);
        Bd.setForeground(B);
        Bd.sleep(100);
        Bd.setForeground(C);
        Bd.sleep(100);
        Bd.setForeground(B);
        Bd.sleep(100);
        Bd.setForeground(C);
    }
}

