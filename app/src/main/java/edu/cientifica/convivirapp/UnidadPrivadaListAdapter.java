package edu.cientifica.convivirapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class UnidadPrivadaListAdapter
        extends RecyclerView.Adapter<UnidadPrivadaListAdapter.upViewHolder>
        implements View.OnClickListener{

    List<UnidadPrivada> unidadPrivadaList;

    private View.OnClickListener listener;


    public UnidadPrivadaListAdapter(List<UnidadPrivada> unidadPrivadaList) {
        this.unidadPrivadaList = unidadPrivadaList;
    }

    @NonNull
    @Override
    public upViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_unidad_privada,null,false);

        //view.setOnClickListener(this);
        return new upViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull upViewHolder holder, int position) {
        holder.asignarDatos(unidadPrivadaList.get(position));
    }

    @Override
    public int getItemCount() {
        return unidadPrivadaList.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener =listener;


    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }

    }



    public class upViewHolder extends RecyclerView.ViewHolder {
        TextView tvTipoNumero;
        TextView tvPropietario;


        public upViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTipoNumero = itemView.findViewById(R.id.tvTipoNumero);
            tvPropietario = itemView.findViewById(R.id.tvPropietario);

        }


        public void asignarDatos(UnidadPrivada unidadPrivada) {
            tvTipoNumero.setText(unidadPrivada.getTipo()+"-"+unidadPrivada.getNumero());
            tvPropietario.setText(unidadPrivada.getPropietario());
        }


    }
}
