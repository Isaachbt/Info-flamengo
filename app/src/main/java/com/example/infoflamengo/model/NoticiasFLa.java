package com.example.infoflamengo.model;

public class NoticiasFLa {
    private int titulo;
    private int descricao;
    private String data;

    public NoticiasFLa(int titulo, int descricao, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
