package com.planck.flustra.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private String clientCode;
    private String clientFirstName;
    private String clientLastName;
    private String clientPhoneNumber;
    private String clientEmail;
    private String clientAddress;
    private String clientCity;
    private String clientPin;
}
