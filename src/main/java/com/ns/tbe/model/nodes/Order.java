package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Node
public class Order {
    @Id
    @GeneratedValue
    private Long Id;
    private String orderNumber;
    private String webOrderNumber;
    private Long memberId;
    private Long retailCustomerId;
    private int salesCountryId;
    private String distributorCountryCode;
    private String purchaseCountryCode;
    private String orderType;
    private String priceTier;
    private String orderStatus;
    private String orderSource;
    private int orderMonth;
    private int orderYear;
    private LocalDateTime orderDate;
    private String currencyCode;
    private BigDecimal newDistributorPrice;
    private BigDecimal totalRetailPrice;
    private BigDecimal totalWholeSalePrice;
    private BigDecimal totalSellingPrice;
    private BigDecimal totalProductVolume;
    private BigDecimal totalDiscount;
    private BigDecimal totalDiscountPercent;
    private BigDecimal totalTaxAmount;
    private String shippingSource;
    private String shippingFirstName;
    private String shippingMiddleName;
    private String shippingLastName;
    private String shippingAddressLine1;
    private String shippingAddressLine2;
    private String shippingAddressLine3;
    private String shippingAddressLine4;
    private String shippingCity;
    private String shippingState;
    private String shippingCountry;
    private String shippingPostalCode;
    private String shippingLatitude;
    private String shippingLongitude;
    private String shippingPrimaryPhone;
    private String shippingAlternatePhone;
    private String shippingEmail;
    private String shippingLocationCode;
    private String billingFirstName;
    private String billingMiddleName;
    private String billingLastName;
    private String billingAddressLine1;
    private String billingAddressLine2;
    private String billingAddressLine3;
    private String billingAddressLine4;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private String billingPostalCode;
    private String billingLatitude;
    private String billingLongitude;
    private String billingPrimaryPhone;
    private String billingAlternatePhone;
    private String billingEmail;
    private String billingLocationCode;
    private boolean isHistory;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "orderLineItems", direction = Relationship.Direction.OUTGOING)
    List<OrderLineItem> orderLineItems = new ArrayList<>();

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

    public String getWebOrderNumber() {
        return webOrderNumber;
    }

    public void setWebOrderNumber(String webOrderNumber) {
        this.webOrderNumber = webOrderNumber;
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

    public String getDistributorCountryCode() {
        return distributorCountryCode;
    }

    public void setDistributorCountryCode(String distributorCountryCode) {
        this.distributorCountryCode = distributorCountryCode;
    }

    public String getPurchaseCountryCode() {
        return purchaseCountryCode;
    }

    public void setPurchaseCountryCode(String purchaseCountryCode) {
        this.purchaseCountryCode = purchaseCountryCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPriceTier() {
        return priceTier;
    }

    public void setPriceTier(String priceTier) {
        this.priceTier = priceTier;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public int getOrderMonth() {
        return orderMonth;
    }

    public void setOrderMonth(int orderMonth) {
        this.orderMonth = orderMonth;
    }

    public int getOrderYear() {
        return orderYear;
    }

    public void setOrderYear(int orderYear) {
        this.orderYear = orderYear;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getNewDistributorPrice() {
        return newDistributorPrice;
    }

    public void setNewDistributorPrice(BigDecimal newDistributorPrice) {
        this.newDistributorPrice = newDistributorPrice;
    }

    public BigDecimal getTotalRetailPrice() {
        return totalRetailPrice;
    }

    public void setTotalRetailPrice(BigDecimal totalRetailPrice) {
        this.totalRetailPrice = totalRetailPrice;
    }

    public BigDecimal getTotalWholeSalePrice() {
        return totalWholeSalePrice;
    }

    public void setTotalWholeSalePrice(BigDecimal totalWholeSalePrice) {
        this.totalWholeSalePrice = totalWholeSalePrice;
    }

    public BigDecimal getTotalSellingPrice() {
        return totalSellingPrice;
    }

    public void setTotalSellingPrice(BigDecimal totalSellingPrice) {
        this.totalSellingPrice = totalSellingPrice;
    }

    public BigDecimal getTotalProductVolume() {
        return totalProductVolume;
    }

    public void setTotalProductVolume(BigDecimal totalProductVolume) {
        this.totalProductVolume = totalProductVolume;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getTotalDiscountPercent() {
        return totalDiscountPercent;
    }

    public void setTotalDiscountPercent(BigDecimal totalDiscountPercent) {
        this.totalDiscountPercent = totalDiscountPercent;
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public String getShippingSource() {
        return shippingSource;
    }

    public void setShippingSource(String shippingSource) {
        this.shippingSource = shippingSource;
    }

    public String getShippingFirstName() {
        return shippingFirstName;
    }

    public void setShippingFirstName(String shippingFirstName) {
        this.shippingFirstName = shippingFirstName;
    }

    public String getShippingMiddleName() {
        return shippingMiddleName;
    }

    public void setShippingMiddleName(String shippingMiddleName) {
        this.shippingMiddleName = shippingMiddleName;
    }

    public String getShippingLastName() {
        return shippingLastName;
    }

    public void setShippingLastName(String shippingLastName) {
        this.shippingLastName = shippingLastName;
    }

    public String getShippingAddressLine1() {
        return shippingAddressLine1;
    }

    public void setShippingAddressLine1(String shippingAddressLine1) {
        this.shippingAddressLine1 = shippingAddressLine1;
    }

    public String getShippingAddressLine2() {
        return shippingAddressLine2;
    }

    public void setShippingAddressLine2(String shippingAddressLine2) {
        this.shippingAddressLine2 = shippingAddressLine2;
    }

    public String getShippingAddressLine3() {
        return shippingAddressLine3;
    }

    public void setShippingAddressLine3(String shippingAddressLine3) {
        this.shippingAddressLine3 = shippingAddressLine3;
    }

    public String getShippingAddressLine4() {
        return shippingAddressLine4;
    }

    public void setShippingAddressLine4(String shippingAddressLine4) {
        this.shippingAddressLine4 = shippingAddressLine4;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingLatitude() {
        return shippingLatitude;
    }

    public void setShippingLatitude(String shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    public String getShippingLongitude() {
        return shippingLongitude;
    }

    public void setShippingLongitude(String shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    public String getShippingPrimaryPhone() {
        return shippingPrimaryPhone;
    }

    public void setShippingPrimaryPhone(String shippingPrimaryPhone) {
        this.shippingPrimaryPhone = shippingPrimaryPhone;
    }

    public String getShippingAlternatePhone() {
        return shippingAlternatePhone;
    }

    public void setShippingAlternatePhone(String shippingAlternatePhone) {
        this.shippingAlternatePhone = shippingAlternatePhone;
    }

    public String getShippingEmail() {
        return shippingEmail;
    }

    public void setShippingEmail(String shippingEmail) {
        this.shippingEmail = shippingEmail;
    }

    public String getShippingLocationCode() {
        return shippingLocationCode;
    }

    public void setShippingLocationCode(String shippingLocationCode) {
        this.shippingLocationCode = shippingLocationCode;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingMiddleName() {
        return billingMiddleName;
    }

    public void setBillingMiddleName(String billingMiddleName) {
        this.billingMiddleName = billingMiddleName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingAddressLine1() {
        return billingAddressLine1;
    }

    public void setBillingAddressLine1(String billingAddressLine1) {
        this.billingAddressLine1 = billingAddressLine1;
    }

    public String getBillingAddressLine2() {
        return billingAddressLine2;
    }

    public void setBillingAddressLine2(String billingAddressLine2) {
        this.billingAddressLine2 = billingAddressLine2;
    }

    public String getBillingAddressLine3() {
        return billingAddressLine3;
    }

    public void setBillingAddressLine3(String billingAddressLine3) {
        this.billingAddressLine3 = billingAddressLine3;
    }

    public String getBillingAddressLine4() {
        return billingAddressLine4;
    }

    public void setBillingAddressLine4(String billingAddressLine4) {
        this.billingAddressLine4 = billingAddressLine4;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingLatitude() {
        return billingLatitude;
    }

    public void setBillingLatitude(String billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    public String getBillingLongitude() {
        return billingLongitude;
    }

    public void setBillingLongitude(String billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    public String getBillingPrimaryPhone() {
        return billingPrimaryPhone;
    }

    public void setBillingPrimaryPhone(String billingPrimaryPhone) {
        this.billingPrimaryPhone = billingPrimaryPhone;
    }

    public String getBillingAlternatePhone() {
        return billingAlternatePhone;
    }

    public void setBillingAlternatePhone(String billingAlternatePhone) {
        this.billingAlternatePhone = billingAlternatePhone;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingLocationCode() {
        return billingLocationCode;
    }

    public void setBillingLocationCode(String billingLocationCode) {
        this.billingLocationCode = billingLocationCode;
    }

    public boolean isHistory() {
        return isHistory;
    }

    public void setHistory(boolean history) {
        isHistory = history;
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

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }
}
