package com.artemnizhnyk.servletpractice.domain.model;

import jakarta.mail.Address;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String firstname;
    @Column(unique = true, nullable = false)
    private String surname;

    private Address address;
    private ContactInfo contactInfo;
}
