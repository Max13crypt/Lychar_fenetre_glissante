package Controller;


import Modele.Player;
import Modele.Carte;

public class Service {

    public Player ajouterPlayer(String nom, int num){
        Player newPlayer = null;
        try{
            newPlayer = new Player(nom, num);
            System.out.println("Player ajouté");
        }catch{
            System.out.println("Probleme ajout Player");
        }
        return newPlayer;
    }

    public Carte creerCarte(String texte, String type){
        Carte newCarte = null;
        try{
            newCarte = new Carte(texte, type, true);
            System.out.println("Carte ajouté");
        }catch{
            System.out.println("Probleme ajout Carte");
        }
        return newCarte;
    }

    public void supprimerCarte(Carte laCarte){
        laCarte.setStatut(false);
    }

    public void modifierCarteType(Carte laCarte, String type){
        laCarte.setType(type);
    }

    public void modifierCarteTexte(Carte laCarte, String texte){
        laCarte.setTexte(texte);
    }


}
