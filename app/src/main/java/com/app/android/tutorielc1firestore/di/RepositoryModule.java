package com.app.android.tutorielc1firestore.di;

import com.app.android.tutorielc1firestore.model.Livre;
import com.app.android.tutorielc1firestore.repositories.LivresFirestoreRepository;
import com.app.android.tutorielc1firestore.repositories.LivresRepository;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(value = ActivityComponent.class)
public abstract class RepositoryModule {
    @Binds
    public abstract LivresRepository bindLivreRepository (LivresFirestoreRepository livresFirestoreRepository);
}
