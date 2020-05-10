package com.travellab.model;

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
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
@ToString
@Entity
public class TicketReturn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @RestResource(exported = false)
    @OneToOne(mappedBy = "returnState")
    private Ticket ticket;

    private LocalDateTime dateOfReturn;

    private boolean isApproved;
}
