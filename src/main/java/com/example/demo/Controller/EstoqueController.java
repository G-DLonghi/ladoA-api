package com.example.demo.Controller;

import com.example.demo.Model.Estoque;
import com.example.demo.Service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/estoque")
public class EstoqueController {
    private final EstoqueService estoqueService;

    @Autowired
    public EstoqueController(EstoqueService estoqueService){
        this.estoqueService = estoqueService;
    }

    @GetMapping
    public List<Estoque> getEstoque(){
        return estoqueService.getEstoque();
    }
}
