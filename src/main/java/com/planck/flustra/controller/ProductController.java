package com.planck.flustra.controller;


import com.planck.flustra.dto.ProductRequestDTO;
import com.planck.flustra.dto.ProductResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flustra")
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/products")
    public ProductResponseDTO getProducts(@RequestHeader("ChannelId") String channelId) {
        return null;
    }

    @PostMapping("/products")
    public ProductResponseDTO getProductsSearch(@RequestHeader("ChannelId") String channelId,
                                                @RequestBody ProductRequestDTO requestDTO) {
        return null;
    }
}
