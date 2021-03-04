package com.app.android.tutorielc1firestore.ui;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.android.tutorielc1firestore.R;
import com.app.android.tutorielc1firestore.databinding.FragmentAjouterLivreBinding;
import com.app.android.tutorielc1firestore.viewmodels.AjouterLivreViewModel;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AjouterLivreFragment extends Fragment implements View.OnClickListener {

    @Inject
    AjouterLivreViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentAjouterLivreBinding binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_ajouter_livre,
                container,
                false);

        binding.setViewModel(viewModel);
        binding.addBookFab.setOnClickListener(this);

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.add_book_fab) {
            if (viewModel.getBookName() == null || viewModel.getBookName().equals("")) {
                //afficher message erreur
            } else if (viewModel.getBookAuthor() == null || viewModel.getBookAuthor().equals("")) {
                //afficher message erreur
            } else {
                viewModel.ajouterLivre();
                Navigation.findNavController(view).navigateUp();
            }
        }
    }
}