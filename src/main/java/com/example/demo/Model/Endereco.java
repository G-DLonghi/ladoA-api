package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Endereco {
    @Id
    private Integer id;
    private String cidade;
    private String estado;
    private String cep;
    @Column(name= "compra_id")
    private Integer compraId;

    public Endereco(Integer id, String cidade, String estado, String cep, Integer compraId) {
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.compraId = compraId;
    }
    public Endereco() {}

    public Integer getId() {
        return id;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return cep;
    }
    public Integer getCompraId() {
        return compraId;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", compraId=" + compraId +
                '}';
    }
}
