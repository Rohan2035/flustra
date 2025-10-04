package com.planck.flustra.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private String orderCode;
    private String productCode;
    private String clientCode;
    private String orderDate;
    private String orderStatus;
    private Boolean orderCompletion;
}
