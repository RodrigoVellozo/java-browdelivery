package com.rodrigovellozo.browdelivery.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigovellozo.browdelivery.models.Cliente;

@Repository // @Repository is not needed if you extend JpaRepository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
  
}
