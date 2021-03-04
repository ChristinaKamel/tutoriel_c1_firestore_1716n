package com.app.android.tutorielc1firestore.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.app.android.tutorielc1firestore.repositories.LivresFirestoreRepository;
import com.app.android.tutorielc1firestore.model.Livre;

import java.util.List;

import javax.inject.Inject;

public class LivresViewModel extends ViewModel {

    @Inject
    public LivresFirestoreRepository livresRepository;

    @Inject public LivresViewModel () {}

    public LiveData<List<Livre>> getLivres() {
        return livresRepository.getAllLivres();
    }
}
