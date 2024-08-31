package com.artemnizhnyk.servletpractice.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String city;
    @Column(unique = true, nullable = false)
    private String street;
    @Column(unique = true, nullable = false)
    private String postalCode;
}
