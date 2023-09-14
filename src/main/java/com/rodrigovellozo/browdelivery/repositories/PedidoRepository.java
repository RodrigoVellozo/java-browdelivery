package com.rodrigovellozo.browdelivery.repositories;

import com.rodrigovellozo.browdelivery.models.Pedido;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long>   {
    
}
