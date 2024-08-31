package com.artemnizhnyk.servletpractice.domain.model;

import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@FlowScoped("userinfo")
public class UserInfo implements Serializable {

    private String firstname;
    private String surname;
    private String email;
    private String phoneNumber;
    private String city;
    private String street;
    private String postalCode;
}
