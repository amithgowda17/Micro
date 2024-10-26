package com.xworkz.productapp.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product_details")
public class ProductDto {

        @Column(name =  "id")
        @Id
        private int productId;
        @Column(name =  "product_name")
        private String  productName;
        @Column(name =  "category")
        private String productCategory;
        @Column(name =  "price")
        private double price;
        @Column(name =  "ratings")
        private double ratings;
}
