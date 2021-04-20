package edu.fbansept.stream;

public class Note {
    private String matiere;
    private int valeur;

    public Note(String matiere, int valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
