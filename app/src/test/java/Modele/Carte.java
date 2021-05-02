package Modele;

public class Carte {
    private String texte;
    private String type;
    private boolean statut;

    public Carte(String texte, String type, boolean statut) {
        this.texte = texte;
        this.type = type;
        this.statut = statut;
    }

    public Carte() {
    }

    public String getTexte() {
        return texte;
    }

    public String getType() {
        return type;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }
}
