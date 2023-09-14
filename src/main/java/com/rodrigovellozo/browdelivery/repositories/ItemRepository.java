package com.rodrigovellozo.browdelivery.repositories;

import com.rodrigovellozo.browdelivery.models.Item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>  {
    
}
