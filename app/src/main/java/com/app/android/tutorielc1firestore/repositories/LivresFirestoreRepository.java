package com.app.android.tutorielc1firestore.repositories;

import androidx.lifecycle.LiveData;

import com.app.android.tutorielc1firestore.livedata.LivresLiveData;
import com.app.android.tutorielc1firestore.model.Livre;
import com.app.android.tutorielc1firestore.utils.FirebaseUtil;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LivresFirestoreRepository implements LivresRepository{

    private final LiveData<List<Livre>> livresLiveData;

    @Inject public LivresFirestoreRepository() {
        livresLiveData = new LivresLiveData(FirebaseUtil.getLivresCollectionRef());
    }

    @Override
    public LiveData<List<Livre>> getAllLivres() {
        return livresLiveData;
    }

    @Override
    public void ajouterLivre (Livre livre) {
        FirebaseUtil.getLivresCollectionRef().add(livre);
    }

}
