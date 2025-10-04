package com.planck.flustra.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private String productCode;
    private String productName;
    private String productDescription;
    private String productCategory;
}
