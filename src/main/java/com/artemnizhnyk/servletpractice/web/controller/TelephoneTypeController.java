package com.artemnizhnyk.servletpractice.web.controller;

import com.artemnizhnyk.servletpractice.util.JsfUtil;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class TelephoneTypeController implements Serializable {

    @EJB
    private TelephoneTypeDao dao;

    public TelephoneTypeDao getDao() {
        return dao;
    }

    public SelectItem[] getTelephoneTypeItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getDao().findTelephoneTypeEntities(), true);
    }

}
