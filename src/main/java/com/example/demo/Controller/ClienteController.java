package com.example.demo.Controller;

import com.example.demo.Model.Cliente;
import com.example.demo.Model.Vinil;
import com.example.demo.Service.ClienteService;
import com.example.demo.Service.VinilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired //this "at" says that the vinilService will be instancialized for us magically
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getCliente(){
        return clienteService.getCliente();
    }

    @GetMapping("/id/{id}")
    public Optional<Cliente> getClienteBtId(@PathVariable("id") int id){
        return clienteService.getClienteById(id);
    }
    @GetMapping("/email/{email}")
    public Optional<Cliente> getClienteByEmail(@PathVariable("email") String email){
        return clienteService.getClienteByEmail(email);
    }
    @PostMapping("/verify")
    public Optional<Cliente> verifyCliente(@RequestBody Cliente cliente){
        return clienteService.verifyCliente(cliente);
    }

    @PostMapping
    public ResponseEntity<?> signUpCliente(@RequestBody Cliente cliente){
        return clienteService.signUpCliente(cliente);
    }

    @DeleteMapping(path = "{clienteId}")
    public void deleteClienteById(@PathVariable("clienteId") int clienteId){
        clienteService.deleteClienteById(clienteId);
    }
}
