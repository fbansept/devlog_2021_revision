package edu.fbansept;

import java.util.ArrayList;

public class Utilisateur {

    private String nom;
    private String motDePasseCrypte;



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasseDecrypte(Decodeur decode) {
        return decode.decode(motDePasseCrypte);
    }

    public String getMotDePasseCrypte() {
        return motDePasseCrypte;
    }

    public void setMotDePasseCrypte(String motDePasseCrypte) {
        this.motDePasseCrypte = motDePasseCrypte;
    }
}
