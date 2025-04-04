package com.example.demo.Repository;

import com.example.demo.Model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
    @Query("SELECT c FROM Compra c WHERE c.id = :id")
    Optional<List<Compra>> getCompraByClienteId(@Param("id") int id);
}
