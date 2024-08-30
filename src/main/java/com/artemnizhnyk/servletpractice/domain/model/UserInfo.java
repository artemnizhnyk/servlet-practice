package com.artemnizhnyk.servletpractice.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_info")
@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String firstname;
    @Column(unique = true, nullable = false)
    private String surname;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String city;
    @Column(unique = true, nullable = false)
    private String street;
    @Column(unique = true, nullable = false)
    private String postalCode;
}
