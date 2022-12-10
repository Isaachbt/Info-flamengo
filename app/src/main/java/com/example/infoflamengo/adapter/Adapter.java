package com.example.infoflamengo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infoflamengo.R;
import com.example.infoflamengo.model.NoticiasFLa;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    public Context context;
    public List<NoticiasFLa> list;

    public Adapter(Context context, List<NoticiasFLa> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_noticias,parent,false);
        return new MyViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NoticiasFLa noticias = list.get(position);
    holder.titulo.setText(noticias.getTitulo());
    holder.descricao.setText(noticias.getDescricao());
    holder.data.setText(noticias.getData());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo,descricao,data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.txtTitulo);
            descricao = itemView.findViewById(R.id.txtDescricao);
            data = itemView.findViewById(R.id.txtData);
        }
    }
}
