package com.app.android.tutorielc1firestore.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.app.android.tutorielc1firestore.repositories.LivresFirestoreRepository;
import com.app.android.tutorielc1firestore.model.Livre;

import javax.inject.Inject;

public class AjouterLivreViewModel extends BaseObservable {

    @Inject
    LivresFirestoreRepository livresRepository;
    private Livre livreAAjouter;

    @Inject
    public AjouterLivreViewModel() {
        livreAAjouter = new Livre("", "");
    }

    public void ajouterLivre() {
        livresRepository.ajouterLivre(livreAAjouter);
    }

    @Bindable
    public String getBookName() {
        return livreAAjouter.getTitreLivre();
    }

    public void setBookName(String bookName) {
        if (!livreAAjouter.getTitreLivre().equals(bookName)) {
            livreAAjouter.setTitreLivre(bookName);
        }
    }

    @Bindable
    public String getBookAuthor() {
        return livreAAjouter.getAuteurLivre();
    }

    public void setBookAuthor(String bookAuthor) {
        if (!livreAAjouter.getAuteurLivre().equals(bookAuthor)) {
            livreAAjouter.setAuteurLivre(bookAuthor);
        }
    }
}
