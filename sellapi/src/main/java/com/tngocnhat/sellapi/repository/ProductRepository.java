package com.tngocnhat.sellapi.repository;

import com.tngocnhat.sellapi.entity.Product;
import org.springframework.data.jpa.repository.*;
import java.time.LocalDate;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);

    @Query("SELECT p FROM Product p ORDER BY p.salesCount DESC LIMIT 10")
    List<Product> findTop10ByOrderBySalesCountDesc();

    @Query("SELECT p FROM Product p WHERE p.createdDate >= ?1 ORDER BY p.createdDate DESC LIMIT 10")
    List<Product> findTop10Recent(LocalDate sevenDaysAgo);

    List<Product> findTop10ByCategoryIdOrderBySalesCountDesc(Long categoryId);
}