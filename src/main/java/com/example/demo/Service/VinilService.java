package com.example.demo.Service;

import com.example.demo.Repository.VinilRepository;
import com.example.demo.Model.Vinil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //tells Spring that the type of this COMPONENT is Service
public class VinilService {
    private final VinilRepository vinilRepository;

    @Autowired
    public VinilService(VinilRepository vinilRepository) {
        this.vinilRepository = vinilRepository;
    }
    public List<Vinil> getVinil(){
        return vinilRepository.findAll();
    }
    public List<Vinil> getVinilGenre(){
        return vinilRepository.findVinilGenre();
    }
    public void addNewVinil(Vinil vinil) {
        vinilRepository.save(vinil);
    }

    public void deleteVinil(int id) {
        if(!vinilRepository.existsById(id)){
            throw new IllegalStateException(
                    "Vinil com id "+id+" não existe."
            );
        }
        vinilRepository.deleteById(id);
    }

}
