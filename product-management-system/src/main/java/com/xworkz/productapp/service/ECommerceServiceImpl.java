package com.xworkz.productapp.service;

import com.xworkz.productapp.dao.ECommerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;

public class ECommerceServiceImpl implements ECommerceService{

        EcommerceDao ecommerceDao = new ECommerceDaoImpl();

    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
         boolean productStored = false;
          boolean productNameValid = false;
          boolean productCategoryValid = false;
            if(dto != null){
                if(dto.getProductName() != null && !dto.getProductName().isEmpty()){
                    System.out.println("Product Name Validated!!");
                     productNameValid = true;
                }
                if(dto.getProductCategory() != null && !dto.getProductCategory().isEmpty()){
                    System.out.println("Product Category Validated!!");
                    productCategoryValid = true;
                }

            }

            if(productNameValid == true && productCategoryValid == true)
             productStored      =  ecommerceDao.addProduct(dto);

            return productStored ;
    }

}
