package com.example.demo.Service;

import com.example.demo.Model.Cliente;
import com.example.demo.Model.Vinil;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.VinilRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ResponseEntity<?> signUpCliente(Cliente cliente) {
        Optional<Cliente> existe = clienteRepository.findByEmail(cliente.getEmail());

        if (existe.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("E-mail já cadastrado.");
        }
        Cliente novoCliente = clienteRepository.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
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

    public Optional<Cliente> getClienteById(int id) {
        return clienteRepository.findById(id);
    }

    public Optional<Cliente> getClienteByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public Optional<Cliente> verifyCliente(Cliente cliente) {
        Optional<Cliente> existe = clienteRepository.findByEmail(cliente.getEmail());

        if(existe.isPresent()){
            if(cliente.getEmail().equals(existe.get().getEmail())){
                if(existe.get().getSenha().equals(cliente.getSenha())){
                    return existe;
                }
            }
        }
        return null;
    }
}
