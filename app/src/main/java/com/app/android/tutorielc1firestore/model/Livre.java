package com.app.android.tutorielc1firestore.model;

public class Livre {

    private String titreLivre;
    private String auteurLivre;

    public Livre() {}

    public Livre(String titreLivre, String auteurLivre) {
        this.titreLivre = titreLivre;
        this.auteurLivre = auteurLivre;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public String getAuteurLivre() {
        return auteurLivre;
    }

    public void setAuteurLivre(String auteurLivre) {
        this.auteurLivre = auteurLivre;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "titreLivre='" + titreLivre + '\'' +
                ", auteurLivre='" + auteurLivre + '\'' +
                '}';
    }
}
