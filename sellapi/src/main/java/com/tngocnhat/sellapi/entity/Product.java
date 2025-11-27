package com.tngocnhat.sellapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private String imagePath;
    private Integer salesCount = 0;
    private LocalDate createdDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}