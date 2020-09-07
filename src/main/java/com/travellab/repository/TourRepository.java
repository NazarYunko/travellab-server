package com.travellab.repository;

import com.travellab.RestConstants;
import com.travellab.model.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@RepositoryRestResource()
public interface TourRepository extends JpaRepository<Tour, Long> {

    @Query(value = "SELECT t.* FROM tour t " +
            "WHERE (:tourTypeId IS NULL OR t.tour_type_id=:tourTypeId)" +
            "AND(:countryId IS NULL OR t.country_id=:countryId)" +
            "AND (:priceMin IS NULL OR t.price >= :priceMin) AND (:priceMax IS NULL OR t.price <= :priceMax)" +
            "AND (:tourStartDate IS NULL OR (t.tour_start_date <= :tourStopDate)) " +
            "AND (:tourStopDate IS NULL OR (t.tour_stop_date >= :tourStartDate))", nativeQuery = true)
    List<Tour> findAllByTourTypeIdAndCountryIdAndTourDateRangeAndPriceRange(@Param("tourTypeId") Long tourTypeId,
                                                                            @Param("countryId") Long countryId,
                                                                            @Param("tourStartDate") Timestamp tourStartDate,
                                                                            @Param("tourStopDate") Timestamp tourStopDate,
                                                                            @Param("priceMin") BigDecimal priceMin,
                                                                            @Param("priceMax") BigDecimal priceMax);
}
