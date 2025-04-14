package com.example.demo.Controller;

import com.example.demo.Model.Cliente;
import com.example.demo.Model.Endereco;
import com.example.demo.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/endereco")
public class EnderecoController {

    private final EnderecoService enderecoService;

    @Autowired //this "at" says that the vinilService will be instancialized for us magically
    public EnderecoController(EnderecoService enderecoService){
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public List<Endereco> getEndereco(){
        return enderecoService.getEndereco();
    }

    @GetMapping ("/cliente/{id}")
    public List<Endereco> getEnderecoByClienteId(){
        return null;
    }

    @GetMapping ("/{id}")
    public List<Endereco> getEnderecoById(){
        return null;
    }

    @PostMapping
    public void saveEndereco(@RequestBody Endereco endereco){
        enderecoService.saveEndereco(endereco);
    }
}
