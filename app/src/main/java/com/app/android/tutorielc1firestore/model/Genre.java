package com.app.android.tutorielc1firestore.model;

public class Genre {

    private String nomGenre;

    public Genre(String nomGenre) {
        this.nomGenre = nomGenre;
    }

    public String getNomGenre() {
        return nomGenre;
    }

    public void setNomGenre(String nomGenre) {
        this.nomGenre = nomGenre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "nomGenre='" + nomGenre + '\'' +
                '}';
    }
}
