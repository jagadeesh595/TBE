package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.math.BigDecimal;

@Node
public class Order {
    @Id
    @GeneratedValue
    private Long Id;
    private String orderNumber;
    private Long memberId;
    private int salesCountryId;
    private BigDecimal totalRetailPrice;
    private BigDecimal totalProductVolume;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public int getSalesCountryId() {
        return salesCountryId;
    }

    public void setSalesCountryId(int salesCountryId) {
        this.salesCountryId = salesCountryId;
    }

    public BigDecimal getTotalRetailPrice() {
        return totalRetailPrice;
    }

    public void setTotalRetailPrice(BigDecimal totalRetailPrice) {
        this.totalRetailPrice = totalRetailPrice;
    }

    public BigDecimal getTotalProductVolume() {
        return totalProductVolume;
    }

    public void setTotalProductVolume(BigDecimal totalProductVolume) {
        this.totalProductVolume = totalProductVolume;
    }
}
