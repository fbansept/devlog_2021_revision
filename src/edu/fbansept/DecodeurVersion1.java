package edu.fbansept;

public class DecodeurVersion1 implements Decodeur{

    @Override
    public String decode(String motDePasseCrypte) {
        return motDePasseCrypte.toLowerCase() + "root";
    }
}
