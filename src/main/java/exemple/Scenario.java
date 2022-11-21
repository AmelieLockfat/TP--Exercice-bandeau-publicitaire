package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {
    public String nomScenario;
    public ArrayList<Effet> scenario;

    public Scenario(String nomScenario, ArrayList<Effet> scenario) {
        this.nomScenario = nomScenario;
        this.scenario = scenario;
    }

    public void AjouteAuScenario(Effet EffetAAjouter, int Repetition) {
        for (int i = 1; i <= Repetition; i++) {
            scenario.add(EffetAAjouter);
        }
    }
    public void executerScenario(Bandeau Bd){
        for(Effet eff : scenario) {
            eff.executer(Bd);
        }


        }
    }

