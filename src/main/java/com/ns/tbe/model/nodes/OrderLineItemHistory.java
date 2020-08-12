package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Node
public class OrderLineItemHistory {
    @Id
    @GeneratedValue
    private Long id;
    private long orderLineItemID;
    private String itemNumber;
    private String itemName;
    private int quantity;
    private String productVersion;
    private int sequence;
    private int productType;
    private BigDecimal productVolume;
    private int shippedQty;
    private int backOrderQty;
    private BigDecimal productRetialPrice;
    private BigDecimal productWholeSalePrice;
    private BigDecimal newDistributorPrice;
    private BigDecimal taxAmount;
    private BigDecimal salePrice;
    private int processingMonth;
    private int processingYear;
    private LocalDateTime orderDate;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getOrderLineItemID() {
        return orderLineItemID;
    }

    public void setOrderLineItemID(long orderLineItemID) {
        this.orderLineItemID = orderLineItemID;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public BigDecimal getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(BigDecimal productVolume) {
        this.productVolume = productVolume;
    }

    public int getShippedQty() {
        return shippedQty;
    }

    public void setShippedQty(int shippedQty) {
        this.shippedQty = shippedQty;
    }

    public int getBackOrderQty() {
        return backOrderQty;
    }

    public void setBackOrderQty(int backOrderQty) {
        this.backOrderQty = backOrderQty;
    }

    public BigDecimal getProductRetialPrice() {
        return productRetialPrice;
    }

    public void setProductRetialPrice(BigDecimal productRetialPrice) {
        this.productRetialPrice = productRetialPrice;
    }

    public BigDecimal getProductWholeSalePrice() {
        return productWholeSalePrice;
    }

    public void setProductWholeSalePrice(BigDecimal productWholeSalePrice) {
        this.productWholeSalePrice = productWholeSalePrice;
    }

    public BigDecimal getNewDistributorPrice() {
        return newDistributorPrice;
    }

    public void setNewDistributorPrice(BigDecimal newDistributorPrice) {
        this.newDistributorPrice = newDistributorPrice;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public int getProcessingMonth() {
        return processingMonth;
    }

    public void setProcessingMonth(int processingMonth) {
        this.processingMonth = processingMonth;
    }

    public int getProcessingYear() {
        return processingYear;
    }

    public void setProcessingYear(int processingYear) {
        this.processingYear = processingYear;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getRowStatusId() {
        return rowStatusId;
    }

    public void setRowStatusId(int rowStatusId) {
        this.rowStatusId = rowStatusId;
    }
}
