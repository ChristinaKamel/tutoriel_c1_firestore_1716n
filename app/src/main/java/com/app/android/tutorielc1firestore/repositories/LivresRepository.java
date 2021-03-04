package com.app.android.tutorielc1firestore.repositories;

import androidx.lifecycle.LiveData;

import com.app.android.tutorielc1firestore.model.Livre;

import java.util.List;

public interface LivresRepository {
    LiveData<List<Livre>> getAllLivres();
    void ajouterLivre(Livre livre);
}
