package com.example.demo.Service;

import com.example.demo.Model.Compra;
import com.example.demo.Repository.CompraRepository;
import com.example.demo.Repository.VinilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    private final CompraRepository compraRepository;

    @Autowired
    public CompraService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }
    public List<Compra> getCompra(){
        return compraRepository.findAll();
    }
    public Optional<Compra> getCompraById(int id){
        return compraRepository.findById(id);
    }
    public Optional<List<Compra>> getCompraByClienteId(int id){
        return compraRepository.getCompraByClienteId(id);
    }
    public void registerCompra(Compra compra){
        compraRepository.save(compra);
    }
}
