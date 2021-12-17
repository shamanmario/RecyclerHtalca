package com.example.reciclerhtalca;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private ArrayList<Contacto> contactos;

    public Adaptador(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }

    @NonNull
    @Override //dónde se van a mostrar las cardview
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta, parent, false);
        return new ViewHolder(view);
    }

    @Override //qué datos va a tener cada cardview
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.etiquetaNombre.setText(contactos.get(position).getNombre());

        //System.out.println(contactos.get(position).getNombre());

        holder.etiquetaTelefono.setText(contactos.get(position).getTelefono());
        holder.fotito.setImageResource(R.drawable.ic_launcher_cloud_foreground);
    }

    @Override //cuántas cardview se van a crear
    public int getItemCount() {
        return contactos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView etiquetaNombre;
        private TextView etiquetaTelefono;
        private ImageView fotito;

        public ViewHolder(View itemView){
            super(itemView);

            fotito = itemView.findViewById(R.id.imageView2);
            etiquetaNombre = itemView.findViewById(R.id.nombre);
            etiquetaTelefono = itemView.findViewById(R.id.telefono);
        }

    }
}
