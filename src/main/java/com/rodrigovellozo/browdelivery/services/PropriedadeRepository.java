package com.rodrigovellozo.browdelivery.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.rodrigovellozo.browdelivery.models.Propriedade;

public interface PropriedadeRepository extends PagingAndSortingRepository <Propriedade, String>{
    
    @Query("Select p from Propriedade p where p.name like %:filtro% order by category, subcategory, name")
    public List<Propriedade> findByFiltro(@Param("filtro")String filtro);
}


