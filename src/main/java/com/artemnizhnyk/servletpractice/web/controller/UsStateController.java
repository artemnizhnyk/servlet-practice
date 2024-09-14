package com.artemnizhnyk.servletpractice.web.controller;


import com.artemnizhnyk.servletpractice.repository.UsStateDao;
import com.artemnizhnyk.servletpractice.util.JsfUtil;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UsStateController implements Serializable {

    @EJB
    private UsStateDao dao;

    public SelectItem[] getUsStateItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(dao.findUsStateEntities(), true);
    }

    public UsStateDao getDao() {
        return dao;
    }

}
