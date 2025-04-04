package com.example.demo.Controller;

import com.example.demo.Model.Vinil;
import com.example.demo.Service.VinilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "api/v1/vinil")
public class VinilController {

    private final VinilService vinilService;

    @Autowired //this "at" says that the vinilService will be instancialized for us magically
    public VinilController(VinilService vinilService){
        this.vinilService = vinilService;
    }

    @GetMapping
    public List<Vinil> getVinil(){
        return vinilService.getVinil();
    }

    @GetMapping("/{genero}")
    public List<Vinil> getVinilGenre(String genero){
        return vinilService.getVinilGenre();
    }

    @PostMapping
    public void registerNewVinil(@RequestBody Vinil vinil){
        vinilService.addNewVinil(vinil);
    }

    @DeleteMapping(path = "{vinilId}")
    public void deleteVinil(@PathVariable("vinilId") int vinilId){
        vinilService.deleteVinil(vinilId);
    }
}
