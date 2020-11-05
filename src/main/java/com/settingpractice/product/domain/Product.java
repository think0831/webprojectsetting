package com.settingpractice.product.domain;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @Column(length = 20)
    private String productId;

    /**
     *  is good.
     */
    private BigDecimal purchasePricePerUnit;

    /**
     *  is good.
     */
    public Product(BigDecimal purchasePricePerUnit){
        this.productId = UUID.randomUUID().toString();
        this.purchasePricePerUnit = purchasePricePerUnit;
    }
}
