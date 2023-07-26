package com.foodsgroup.foodsapi.model;

import java.math.BigDecimal;

public class ProductModel {
    private String name;

    private BigDecimal totalValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
}
