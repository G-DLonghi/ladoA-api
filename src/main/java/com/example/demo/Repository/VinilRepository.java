package com.example.demo.Repository;

import com.example.demo.Model.Vinil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VinilRepository extends JpaRepository<Vinil, Integer> {

    @Query("SELECT v FROM Vinil v WHERE v.genero = ''")
    List<Vinil> findVinilGenre();
}
/*
ações (até agora)

-pesquisar vinil
-comprar
-adicionar ao carrinho
-ver as informações de compra
-fazer login
-cadastro


 */