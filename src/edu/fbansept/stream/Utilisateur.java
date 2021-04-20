package edu.fbansept.stream;

import java.util.ArrayList;

public class Utilisateur {
    private String nom;
    private int age;

    private ArrayList<Note> listeNote = new ArrayList();

    public Utilisateur(String nom, int age, ArrayList<Note> listeNote) {
        this.nom = nom;
        this.age = age;
        this.listeNote = listeNote;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Note> getListeNote() {
        return listeNote;
    }

    public void setListeNote(ArrayList<Note> listeNote) {
        this.listeNote = listeNote;
    }
}
