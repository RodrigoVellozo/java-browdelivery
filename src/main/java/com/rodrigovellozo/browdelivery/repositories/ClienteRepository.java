package com.rodrigovellozo.browdelivery.repositories;

import com.rodrigovellozo.browdelivery.models.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
  
}
