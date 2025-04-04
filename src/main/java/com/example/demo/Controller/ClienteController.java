package com.example.demo.Controller;

import com.example.demo.Model.Cliente;
import com.example.demo.Model.Vinil;
import com.example.demo.Service.ClienteService;
import com.example.demo.Service.VinilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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

    @PostMapping
    public void signUpCliente(@RequestBody Cliente cliente){
        clienteService.signUpCliente(cliente);
    }

    @DeleteMapping(path = "{clienteId}")
    public void deleteClienteById(@PathVariable("clienteId") int clienteId){
        clienteService.deleteClienteById(clienteId);
    }
}
