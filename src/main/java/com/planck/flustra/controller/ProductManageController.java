package com.planck.flustra.controller;

import com.planck.flustra.dto.ProductDTO;
import com.planck.flustra.dto.ProductResponseDTO;
import com.planck.flustra.dto.ProductSearchRequestDTO;
import com.planck.flustra.dto.StatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("internal")
public class ProductManageController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductManageController.class);

    @PostMapping("filterproduct")
    public ProductResponseDTO getProducts(@RequestBody ProductSearchRequestDTO searchRequestDTO) {
        return null;
    }

    @PostMapping("addproduct")
    public StatusResponse addProduct(@RequestBody ProductDTO productDTO) {
        return null;
    }
}
