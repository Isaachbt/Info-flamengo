package com.example.infoflamengo.fragmente;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infoflamengo.R;
import com.example.infoflamengo.adapter.Adapter;
import com.example.infoflamengo.model.NoticiasFLa;

import java.util.ArrayList;
import java.util.List;

public  class NoticiasFragment extends Fragment {

    public RecyclerView recyclerView;
    private Adapter adapter;
    private List<NoticiasFLa> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticias, container, false);

        recyclerView = view.findViewById(R.id.recycler);


        configRecycler();

        return view;
    }

    public void configRecycler(){

        adapter = new Adapter(getActivity(),list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        this.addNoticias();

    }

    public void addNoticias(){
    NoticiasFLa n1 = new NoticiasFLa(R.string.Titulo1,R.string.descricao1,"22/10/2023");
    list.add(n1);

        NoticiasFLa n2 = new NoticiasFLa(R.string.titulo2,R.string.descricao2,"22/10/2023");
        list.add(n2);

        NoticiasFLa n3 = new NoticiasFLa(R.string.titulo3,R.string.descricao3,"22/10/2023");
        list.add(n3);

        NoticiasFLa n4 = new NoticiasFLa(R.string.titulo4,R.string.descricao4,"22/10/2023");
        list.add(n4);

        NoticiasFLa n5 = new NoticiasFLa(R.string.titulo5,R.string.descricao5,"22/10/2023");
        list.add(n5);

        NoticiasFLa n6 = new NoticiasFLa(R.string.titulo6,R.string.descricao6,"25/11/2023");
        list.add(n6);

        NoticiasFLa n7 = new NoticiasFLa(R.string.titulo7,R.string.descricao7,"27/11/2023");
        list.add(n7);

    }
}