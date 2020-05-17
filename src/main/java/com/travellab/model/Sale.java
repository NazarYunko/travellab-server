package com.travellab.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @RestResource(exported = false)
    @ManyToOne
    private Ticket ticket;

    @RestResource(exported = false)
    @ManyToOne
    private Client client;

    @RestResource(exported = false)
    @ManyToOne
    private Employee employee;

    private int numberOfAdults;

    private int numberOfChild;

    private LocalDateTime dateOfSale;
}
