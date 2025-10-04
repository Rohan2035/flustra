package com.planck.flustra.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String productCode;
    private String productName;
    private String productDescription;
    private String productCategory;
    private Double productPrice;
    private Double productDiscount;
    private Double productDiscountPercent;
    private String productDate;
    private String imgUrlOne;
    private String imgUrlTwo;
}
