package exemple;

import bandeau.Bandeau;

public class ChangeRotation extends Effet {
    public int newRotation;

    public ChangeRotation(int Rotation) {
        this.newRotation = Rotation;
    }



public void executer (Bandeau Bd){
        double ANCrotation = Bd.getRotation();
        Bd.setRotation(newRotation+ANCrotation);
        Bd.sleep(250);

}

}
