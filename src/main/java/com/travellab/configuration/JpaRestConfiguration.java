package com.travellab.configuration;

import com.travellab.model.Client;
import com.travellab.model.Country;
import com.travellab.model.Employee;
import com.travellab.model.Hotel;
import com.travellab.model.Sale;
import com.travellab.model.Ticket;
import com.travellab.model.Tour;
import com.travellab.model.TourType;
import com.travellab.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class JpaRestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Client.class, Country.class, Employee.class, Hotel.class, Sale.class, Ticket.class,
                Tour.class, TourType.class, User.class);
    }
}
