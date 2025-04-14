package com.example.demo.Repository;

import com.example.demo.Model.Compra;
import com.example.demo.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    @Query("SELECT e FROM Endereco e WHERE e.id = :id")
    Optional<List<Endereco>> findEnderecoByClienteId(@Param("id") Integer id);
}
