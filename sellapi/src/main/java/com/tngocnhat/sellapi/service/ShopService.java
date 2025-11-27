package com.tngocnhat.sellapi.service;

import com.tngocnhat.sellapi.entity.*;
import com.tngocnhat.sellapi.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {
    private final CategoryRepository categoryRepo;
    private final ProductRepository productRepo;

    public List<Category> getAllCategories() { return categoryRepo.findAll(); }
    public List<Product> getProductsByCategory(Long id) { return productRepo.findByCategoryId(id); }
    public List<Product> getTopSales() { return productRepo.findTop10ByOrderBySalesCountDesc(); }
    public List<Product> getRecentProducts() { return productRepo.findTop10Recent(LocalDate.now().minusDays(7)); }
}