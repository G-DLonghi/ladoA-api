package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "Compra")
public class Compra {

    // Attributes
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "vinil_id", nullable = false)
    private Vinil vinil;

    @Column(name = "tipo_pagamento", nullable = false)
    private String tipoPagamento;

    @Column(name = "data_compra", nullable = false)
    private LocalDateTime dataCompra;

    @Column(name = "quantidade_produto", nullable = false)
    private int quantidadeProduto;

    // Constructor
    public Compra() {}

    public Compra(Cliente cliente, Vinil vinil, String tipoPagamento, LocalDateTime dataCompra, int quantidadeProduto) {
        this.cliente = cliente;
        this.vinil = vinil;
        this.tipoPagamento = tipoPagamento;
        this.dataCompra = dataCompra;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Compra(int id, Cliente cliente, Vinil vinil, String tipoPagamento, LocalDateTime dataCompra, int quantidadeProduto) {
        this.id = id;
        this.cliente = cliente;
        this.vinil = vinil;
        this.tipoPagamento = tipoPagamento;
        this.dataCompra = dataCompra;
        this.quantidadeProduto = quantidadeProduto;
    }

    // Getters
    public int getId() {
        return this.id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public Vinil getVinil() {
        return this.vinil;
    }
    public String getTipoPagamento() {
        return this.tipoPagamento;
    }
    public LocalDateTime getDataCompra() {
        return this.dataCompra;
    }
    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setVinil(Vinil vinil) {
        this.vinil = vinil;
    }
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    // toString
    @Override
    public String toString() {
        return "Id: " + this.id +
                "\nCliente: " + this.cliente.getId() + // Assuming Cliente has an `getId` method
                "\nVinil: " + this.vinil.getId() + // Assuming Vinil has an `getId` method
                "\nTipo Pagamento: " + this.tipoPagamento +
                "\nData Compra: " + this.dataCompra +
                "\nQuantidade Produto: " + this.quantidadeProduto;
    }
}
