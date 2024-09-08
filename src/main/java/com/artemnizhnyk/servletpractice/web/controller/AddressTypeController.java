package com.artemnizhnyk.servletpractice.web.controller;


import com.artemnizhnyk.servletpractice.util.JsfUtil;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.SelectItem;

import java.io.Serializable;

@Named
@SessionScoped
public class AddressTypeController implements Serializable {

    @EJB
    private AddressTypeDao dao;

    public SelectItem[] getAddressTypeItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(dao.findAddressTypeEntities(), true);
    }

    public AddressTypeDao getDao() {
        return dao;
    }
}