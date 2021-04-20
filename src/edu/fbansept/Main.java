package edu.fbansept;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    Utilisateur utilisateur = new Utilisateur();
        utilisateur.setMotDePasseCrypte("qfgvkaekbhik");
        utilisateur.getMotDePasseDecrypte(motDePAsseCrypte -> motDePAsseCrypte.toLowerCase() + "root");
    }
}
