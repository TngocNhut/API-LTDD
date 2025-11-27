package com.tngocnhat.sellapi.controller;

import com.tngocnhat.sellapi.entity.*;
import com.tngocnhat.sellapi.service.ShopService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "API Bán Bánh Quy & Cà Phê")
public class ShopController {

    private final ShopService service;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }

    @GetMapping("/categories/{id}/products")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable Long id) {
        return ResponseEntity.ok(service.getProductsByCategory(id));
    }

    @GetMapping("/products/top-sales")
    public ResponseEntity<List<Product>> getTopSales() {
        return ResponseEntity.ok(service.getTopSales());
    }

    @GetMapping("/products/recent")
    public ResponseEntity<List<Product>> getRecentProducts() {
        return ResponseEntity.ok(service.getRecentProducts());
    }
}