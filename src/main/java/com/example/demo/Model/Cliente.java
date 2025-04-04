package com.example.demo.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cliente")
public class Cliente {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "senha", nullable = false)
    private String senha;

    // Constructor
    public Cliente() {}
    public Cliente(String nome, String cpf, String email, String telefone, LocalDate dataNascimento, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
    public Cliente(int id, String nome, String cpf, String email, String telefone, LocalDate dataNascimento, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getSenha() {
        return this.senha;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // toString
    @Override
    public String toString() {
        return "Id: " + this.id +
                "\nNome: " + this.nome +
                "\nEmail: " + this.email +
                "\nTelefone: " + this.telefone +
                "\nSenha: " + this.senha;
    }
}
