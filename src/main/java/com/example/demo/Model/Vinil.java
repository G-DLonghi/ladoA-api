package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Vinil")
public class Vinil {
    //Attributes
    @Id
    private int id;
    private String artista;
    private String album;
    private double preco;
    private String genero;

    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;

    //Constructor
    public Vinil(){};

    public Vinil(String artista, String album, double preco, String genero, LocalDate dataLancamento){
        this.artista = artista;
        this.album = album;
        this.preco= preco;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
    }
    public Vinil(int id, String artista, String album, double preco, String genero, LocalDate dataLancamento){
        this.id = id;
        this.artista = artista;
        this.album = album;
        this.preco= preco;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
    }

    //Getters
    public int getId(){
        return this.id;
    }
    public String getArtista(){
        return this.artista;
    }
    public String getAlbum(){
        return this.album;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getGenero(){
        return this.genero;
    }
    public LocalDate getDataLancamento(){
        return this.dataLancamento;
    }

    //Setters
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setDob(LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    //toString
    public String toString(){
        return
                "Id: "+this.id+
                        "Id: "+this.id+
                        "\nArtista: "+this.artista+
                        "\nAlbum: "+this.album+
                        "\nPreço: "+this.preco+
                        "\nGênero: "+this.genero+
                        "\nData Lançamento: "+this.dataLancamento;
    }
}
