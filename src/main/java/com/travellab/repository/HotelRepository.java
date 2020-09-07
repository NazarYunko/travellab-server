package com.travellab.repository;

import com.travellab.RestConstants;
import com.travellab.model.Country;
import com.travellab.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource()
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> findByCountryId(long id);
}
