package com.example.demo.Service;

import com.example.demo.Model.Cliente;
import com.example.demo.Model.Vinil;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.VinilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void signUpCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public int deleteClienteById(int id) {
        if(!clienteRepository.existsById(id)){
            throw new IllegalStateException(
                    "Cliente com id "+id+" não existe."
            );
        }
        clienteRepository.deleteById(id);
        return id;
    }

    public List<Cliente> getCliente() {
        return clienteRepository.findAll();
    }
}
