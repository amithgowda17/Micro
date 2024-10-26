package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;
import java.sql.DriverManager;

public class ECommerceDaoImpl implements EcommerceDao {
    @Override
    public boolean addProduct(ProductDto dto) {

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
           Session session =       factory.openSession();
           session.beginTransaction();
           session.save(dto);
           session.getTransaction().commit();
           factory.close();
           return true;
      }
}
