package com.travellab.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
@ToString
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Tour tour;

    private LocalDateTime dateOfDeparture;

    private float price;

    private int numberOfPeople;

    @OneToMany(mappedBy = "ticket", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Sale> sales;

    @OneToOne
    private TicketReturn returnState;

    public Optional<TicketReturn> getReturnState() {
        return Optional.ofNullable(returnState);
    }
}