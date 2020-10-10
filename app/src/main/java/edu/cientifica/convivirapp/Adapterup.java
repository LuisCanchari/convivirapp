package edu.cientifica.convivirapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapterup extends RecyclerView.Adapter<Adapterup.mHolder> {


    @NonNull
    @Override
    public mHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull mHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class mHolder extends RecyclerView.ViewHolder {

        public mHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
