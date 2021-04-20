package edu.fbansept.stream;

import javax.sql.RowSet;
import java.util.List;
import java.util.function.Predicate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExempleStream {

    public ExempleStream() {
        ArrayList<Utilisateur> liste = new ArrayList<>();

        ArrayList<Note> listeNoteFranck = new ArrayList<>();
        listeNoteFranck.add(new Note("JAVA",5));
        listeNoteFranck.add(new Note("PHP",8));

        liste.add(new Utilisateur(
                "franck",33, listeNoteFranck
        ));

        ArrayList<Note> listeNoteJohn = new ArrayList<>();
        listeNoteFranck.add(new Note("JAVA",1));
        listeNoteFranck.add(new Note("PHP",2));

        liste.add(new Utilisateur("john",25,listeNoteJohn));

        ArrayList<Note> listeNoteToto = new ArrayList<>();
        listeNoteFranck.add(new Note("JAVA",0));
        listeNoteFranck.add(new Note("PHP",0));

        liste.add(new Utilisateur("toto",15,listeNoteToto));

        liste.stream()
                .filter(utilisateur -> utilisateur.getAge() >= 18)
                .forEach(utilisateur ->
                        System.out.println(utilisateur.getNom())
                );

        List<Utilisateur> listeFiltre = liste.stream()
                .filter(utilisateur -> utilisateur.getAge() >= 18)
                .collect(Collectors.toList());

        List<Integer> listeAgeFiltre = liste.stream()
                .filter(utilisateur -> utilisateur.getAge() >= 18)
                .map(utilisateur -> utilisateur.getAge())
                .collect(Collectors.toList());

        String listeEmailPersonneMajeure = liste.stream()
                .filter(u -> u.getAge() >= 18)
                .map(u -> u.getNom() + "@ifa.com")
                .collect(Collectors.joining(", "));


        List<Note> listeNote = liste.stream()
                .map(utilisateur -> utilisateur.getListeNote())
                .flatMap(listeNoteUtilisateur -> listeNoteUtilisateur.stream())
                .collect(Collectors.toList());

        List<Integer> listeValeurNote = liste.stream()
                .map(utilisateur -> utilisateur.getListeNote())
                .flatMap(listeNoteUtilisateur -> listeNoteUtilisateur.stream())
                .map(note -> note.getValeur())
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        new ExempleStream();
    }
}
