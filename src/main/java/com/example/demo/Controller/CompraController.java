package com.example.demo.Controller;

import com.example.demo.Model.Compra;
import com.example.demo.Model.Vinil;
import com.example.demo.Service.CompraService;
import com.example.demo.Service.VinilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "api/v1/compra")
public class CompraController {

    private final CompraService compraService;

    @Autowired //this "at" says that the vinilService will be instancialized for us magically
    public CompraController(CompraService compraService){
        this.compraService = compraService;
    }

    @GetMapping
    public List<Compra> getCompra(){
        return compraService.getCompra();
    }

    @GetMapping("/{id}")
    public Optional<Compra> getCompraById(int id){
        return compraService.getCompraById(id);
    }

    @GetMapping("/cliente/{id}")
    public Optional<List<Compra>> getCompraByClienteId(int id){
        return compraService.getCompraByClienteId(id);
    }

    @PostMapping
    public void registerCompra(@RequestBody Compra compra){
        compraService.registerCompra(compra);
    }

//    @DeleteMapping(path = "{vinilId}")
//    public void deleteVinil(@PathVariable("compraId") int compraId){
//        compraService.deleteVinil(vinilId);
//    }
}
