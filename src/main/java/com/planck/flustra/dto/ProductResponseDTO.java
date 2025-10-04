package com.planck.flustra.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductResponseDTO {
    private String status;
    private String errorMessage;
    private List<ProductDTO> productList;
}
