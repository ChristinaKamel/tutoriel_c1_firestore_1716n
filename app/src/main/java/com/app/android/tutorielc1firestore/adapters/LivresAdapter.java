package com.app.android.tutorielc1firestore.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.app.android.tutorielc1firestore.R;
import com.app.android.tutorielc1firestore.databinding.LivreItemBinding;
import com.app.android.tutorielc1firestore.model.Livre;

import java.util.List;

public class LivresAdapter extends RecyclerView.Adapter<LivresAdapter.LivresViewHolder> {

    private List<Livre> livres;

    public LivresAdapter() {}

    public LivresAdapter (List<Livre> livres) {
        this.livres = livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LivresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LivreItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.livre_item,
                parent,
                false);
        return new LivresViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LivresViewHolder holder, int position) {
        ((LivresViewHolder)holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return livres == null ? 0 : livres.size();
    }

    class LivresViewHolder extends RecyclerView.ViewHolder {

        private LivreItemBinding binding;

        public LivresViewHolder(LivreItemBinding livreItemBinding) {
            super(livreItemBinding.getRoot());
            this.binding = livreItemBinding;
        }

        public void bind (int position) {
            if (livres != null) {
                binding.setLivre(livres.get(position));
            }
        }
    }
}
