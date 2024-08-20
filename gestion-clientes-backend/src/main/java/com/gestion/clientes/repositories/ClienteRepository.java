package com.gestion.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.clientes.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
