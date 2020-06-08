package com.settingpractice.product.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    String productId;

    BigDecimal purchasePricePerUnit;


    public Product(BigDecimal purchasePricePerUnit) {
        this.productId = UUID.randomUUID().toString();
        this.purchasePricePerUnit = purchasePricePerUnit;
    }

}
