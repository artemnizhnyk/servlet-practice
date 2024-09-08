package com.artemnizhnyk.servletpractice.config;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;

@DataSourceDefinition(
        name = "java:app/jdbc/appDataSource",
        className = "org.postgresql.ds.PGSimpleDataSource",
        url = "jdbc:postgresql://localhost:5437/servlet-db",
        user = "postgres",
        password = "postgres")
@Startup
@Singleton
public class DBConfig {
}