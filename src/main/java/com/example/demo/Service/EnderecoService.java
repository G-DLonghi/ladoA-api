package com.example.demo.Service;

import com.example.demo.Model.Endereco;
import com.example.demo.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public List<Endereco> getEndereco(){
        return enderecoRepository.findAll();
    }
    public Optional<List<Endereco>> getEnderecoByClienteId(Integer id){
        return enderecoRepository.findEnderecoByClienteId(id);
    }

    public void saveEndereco(Endereco endereco){
        enderecoRepository.save(endereco);
    }
}
