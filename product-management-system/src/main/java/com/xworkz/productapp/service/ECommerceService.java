package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;

public interface ECommerceService {

       boolean validateAndSaveProduct(ProductDto dto);
}
