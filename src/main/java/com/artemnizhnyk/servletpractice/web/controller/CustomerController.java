package com.artemnizhnyk.servletpractice.web.controller;

import com.artemnizhnyk.servletpractice.domain.converter.CustomerConverter;
import com.artemnizhnyk.servletpractice.domain.model.Customer;
import com.artemnizhnyk.servletpractice.domain.util.PagingInfo;
import com.artemnizhnyk.servletpractice.repository.CustomerDao;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class CustomerController implements Serializable {

    private Customer customer = null;
    private List<Customer> customerItems = null;
    private CustomerConverter converter = null;
    private PagingInfo pagingInfo = null;
    private boolean renderPrevLink;

    @EJB
    private CustomerDao dao;

    @PostConstruct
    public void init() {
        pagingInfo = new PagingInfo();
        converter = new CustomerConverter();
    }

    public PagingInfo getPagingInfo() {
        if (pagingInfo.getItemCount() == -1) {
            pagingInfo.setItemCount(dao.getCustomerCount());
        }
        return pagingInfo;
    }

    public SelectItem[] getCustomerItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(dao.findCustomerEntities(), false);
    }

    public SelectItem[] getCustomerItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(dao.findCustomerEntities(), true);
    }

    public Customer getCustomer() {
        if (customer == null) {
            customer = (Customer) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentCustomer", converter, null);
        }
        if (customer == null) {
            customer = new Customer();
        }
        return customer;
    }

    public String listSetup() {
        reset(true);
        return "/customer/List";
    }
    private void reset(boolean resetFirstItem) {
        customer = null;
        customerItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public Customer findCustomer(Integer id) {
        return dao.findCustomer(id);
    }

}
