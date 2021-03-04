package com.app.android.tutorielc1firestore.utils;

import com.app.android.tutorielc1firestore.model.Genre;
import com.app.android.tutorielc1firestore.model.Livre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutilsLivres {

    public static List<Livre> getLivresPredefinis() {
        return new ArrayList<Livre>(
                Arrays.asList(
                        new Livre("Le prophet", "Gibran Khalil Gibran"),
                        new Livre("Le prophet", "Gibran Khalil Gibran"),
                        new Livre("Le prophet", "Gibran Khalil Gibran")
                )
        );
    }
}
