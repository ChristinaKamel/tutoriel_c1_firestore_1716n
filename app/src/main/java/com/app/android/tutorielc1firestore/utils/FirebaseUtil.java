package com.app.android.tutorielc1firestore.utils;

import com.app.android.tutorielc1firestore.BuildConfig;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseUtil {
    private static final boolean sUseEmulators = BuildConfig.DEBUG;
    private static FirebaseFirestore FIRESTORE;
    public static FirebaseFirestore getFirestore() {
        if (FIRESTORE == null) {
            FIRESTORE = FirebaseFirestore.getInstance();
            if (sUseEmulators) {
                FIRESTORE.useEmulator("10.0.2.2", 8080);
            }
        }

        return FIRESTORE;
    }

    public static CollectionReference getLivresCollectionRef() {
        return getFirestore().collection("livres");
    }
}
