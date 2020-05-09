package com.travellab.repository;

import com.travellab.RestConstants;
import com.travellab.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}