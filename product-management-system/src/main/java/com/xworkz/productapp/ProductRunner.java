package com.xworkz.productapp;

import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.ECommerceService;
import com.xworkz.productapp.service.ECommerceServiceImpl;

public class ProductRunner {


    public static void main(String[] args) {


        ProductDto productDto =new ProductDto();
        productDto.setProductId(1);
        productDto.setProductName("Cetaphill");
        productDto.setPrice(789.00);
        productDto.setProductCategory("Cosmetics");
        productDto.setRatings(4.8);

        ECommerceService eCommerceService = new ECommerceServiceImpl();
        eCommerceService.validateAndSaveProduct(productDto);
    }
}
