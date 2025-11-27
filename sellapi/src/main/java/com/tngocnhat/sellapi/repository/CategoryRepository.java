package com.tngocnhat.sellapi.repository;

import com.tngocnhat.sellapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}