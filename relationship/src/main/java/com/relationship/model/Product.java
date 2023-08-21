package com.relationship.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", length = 100, nullable = false)
    private int id;
    @Column(name = "product_name", length = 100, nullable = false)
    private String name;
    @Column(name = "product_stock", length = 100, nullable = false)
    private String stock;
    @Column(name = "product_price", length = 100, nullable = false, precision = 5, scale = 2)
    private BigDecimal price;
    @Column(name = "product_description", length = 100, nullable = false)
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private Rating ratingOrdinal = Rating.STANDARD;
    @Enumerated(EnumType.STRING)
    private Rating ratingStr = Rating.PREMIUM;


}

enum Color {
    RED("kırmızı"),
    WHITE("beyaz");
    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

enum Rating {
    STANDARD, PREMIUM
}
