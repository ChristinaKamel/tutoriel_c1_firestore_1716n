package com.app.android.tutorielc1firestore.livedata;

import android.util.Log;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.app.android.tutorielc1firestore.model.Livre;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LivresLiveData extends LiveData<List<Livre>> implements EventListener<QuerySnapshot> {

    public List<Livre> livres = new ArrayList<>();

    public LivresLiveData (CollectionReference livresRef) {
        livresRef.addSnapshotListener(this::onEvent);
        Log.e(">>>>>>>>>>>>>>>>>", "constructor");
    }

    @Override
    public void onEvent(@Nullable QuerySnapshot documentSnapshots, @Nullable FirebaseFirestoreException error) {
        Log.e(">>>>>>>>>>>>>>>>>", "onEvent");
        if (error != null) {
            Log.e("LivresLiveData", "onEvent", error);
            return;
        }
        for (DocumentChange change: documentSnapshots.getDocumentChanges()) {
            DocumentSnapshot snapshot = change.getDocument();
            if (change.getType() == DocumentChange.Type.ADDED) {
                Log.e(">>>>>>>>>>>>>>>>>", "ADDED");
                livres.add(snapshot.toObject(Livre.class));
            }
        }
        setValue(livres);
    }
}
