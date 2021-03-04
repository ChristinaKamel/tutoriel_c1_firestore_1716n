package com.app.android.tutorielc1firestore.ui;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.android.tutorielc1firestore.R;
import com.app.android.tutorielc1firestore.adapters.LivresAdapter;
import com.app.android.tutorielc1firestore.databinding.FragmentListeLivresBinding;
import com.app.android.tutorielc1firestore.model.Livre;
import com.app.android.tutorielc1firestore.viewmodels.LivresViewModel;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ListeLivresFragment extends Fragment implements View.OnClickListener {

    @Inject
    LivresViewModel livresViewModel;
    private LivresAdapter livresAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentListeLivresBinding binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_liste_livres,
                container,
                false);


        initialiseAdapter();
        binding.livresRecyclerView.setAdapter(livresAdapter);
        binding.livresRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        binding.addBookFab.setOnClickListener(this);
        return binding.getRoot();
    }

    private void initialiseAdapter() {
        livresAdapter = new LivresAdapter();
        livresViewModel.getLivres().observe(getViewLifecycleOwner(), new Observer<List<Livre>>() {
            @Override
            public void onChanged(List<Livre> livres) {
                livresAdapter.setLivres(livres);
            }
        });
    }

    public void navigateToAddBookFragment(View view) {
        Navigation.findNavController(view).navigate(R.id.action_liste_livres_fragment_destination_to_ajouter_livre_fragment_destination);
    }

    @Override
    public void onClick(View view) {
        navigateToAddBookFragment(view);
    }
}