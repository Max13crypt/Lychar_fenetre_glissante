package Modele;

public class Player {
    private String nom;
    private int num;

    public Player(String nom, int num) {
        this.nom = nom;
        this.num = num;
    }

    public Player() {
    }

    public String getNom() {
        return nom;
    }

    public int getNum() {
        return num;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
