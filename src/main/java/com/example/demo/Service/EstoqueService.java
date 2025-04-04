package com.example.demo.Service;

import com.example.demo.Model.Estoque;
import com.example.demo.Repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    private final EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueService(EstoqueRepository estoqueRepository){
        this.estoqueRepository= estoqueRepository;
    }

    public List<Estoque> getEstoque() {
        return estoqueRepository.findAll();
    }
}
