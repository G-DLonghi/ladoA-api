package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Estoque {
    @Id
    private Integer id;
    private Integer quantidade;

    @Column(name= "vinil_id")
    private Integer vinilId;

    public Estoque(Integer id, Integer quantidade, Integer vinilId) {
        this.id = id;
        this.quantidade = quantidade;
        this.vinilId = vinilId;
    }
    public Estoque() {}

    public Integer getId(){ return this.id;}
    public Integer getQuantidade(){ return this.quantidade;}
    public Integer getVinilId(){ return this.vinilId;}

    public void setId( Integer id){ this.id = id; }
    public void setQuantidade( Integer quantidade){ this.quantidade = quantidade; }
    public void setVinilId( Integer vinilId){ this.vinilId = vinilId; }

    @Override
    public String toString() {
        return "Estoque{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", vinilId=" + vinilId +
                '}';
    }
}
