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
    private int salesCountryId;
    private String distributorCountryCode;
    private String purchaseCountryCode;
    private int orderTypeID;
    private int priceTierID;
    private int orderStatusID;
    private Long orderSourceID;
    private int orderMonth;
    private int orderYear;
    private LocalDateTime orderDate;
    private int currencyID;
    private BigDecimal newDistributorPrice;
    private BigDecimal totalProductRetailPrice;
    private BigDecimal productWholeSalePrice;
    private BigDecimal totalRetailPrice;
    private BigDecimal totalWholeSalePrice;
    private BigDecimal totalProductVolume;
    private BigDecimal totalTaxAmount;
    private BigDecimal totalSellingPrice;
    private BigDecimal totalDiscount;
    private BigDecimal shippingCharge;
    private BigDecimal handlingCharge;
    private String shippingSource;
    private long shippingOrderAddressID;
    private long billingOrderAddressID;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "orderLineItems", direction = Relationship.Direction.OUTGOING)
    List<OrderLineItem> orderLineItems = new ArrayList<>();

    @Relationship(value = "salesCountry", direction = Relationship.Direction.OUTGOING)
    SalesCountry salesCountry = new SalesCountry();

    @Relationship(value = "orderType", direction = Relationship.Direction.OUTGOING)
    OrderType orderType = new OrderType();

    @Relationship(value = "priceTier", direction = Relationship.Direction.OUTGOING)
    PriceTier priceTier = new PriceTier();

    @Relationship(value = "orderStatus", direction = Relationship.Direction.OUTGOING)
    OrderStatus orderStatus = new OrderStatus();

    @Relationship(value = "orderSource", direction = Relationship.Direction.OUTGOING)
    OrderSource orderSource = new OrderSource();

    @Relationship(value = "currency", direction = Relationship.Direction.OUTGOING)
    Currency currency = new Currency();

    @Relationship(value = "shppingAddress", direction = Relationship.Direction.OUTGOING)
    OrderAddress shppingAddress = new OrderAddress();

    @Relationship(value = "billingAddress", direction = Relationship.Direction.OUTGOING)
    OrderAddress billingAddress = new OrderAddress();

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
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

    public int getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public int getPriceTierID() {
        return priceTierID;
    }

    public void setPriceTierID(int priceTierID) {
        this.priceTierID = priceTierID;
    }

    public int getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(int orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    public Long getOrderSourceID() {
        return orderSourceID;
    }

    public void setOrderSourceID(Long orderSourceID) {
        this.orderSourceID = orderSourceID;
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

    public int getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(int currencyID) {
        this.currencyID = currencyID;
    }

    public BigDecimal getNewDistributorPrice() {
        return newDistributorPrice;
    }

    public void setNewDistributorPrice(BigDecimal newDistributorPrice) {
        this.newDistributorPrice = newDistributorPrice;
    }

    public BigDecimal getTotalProductRetailPrice() {
        return totalProductRetailPrice;
    }

    public void setTotalProductRetailPrice(BigDecimal totalProductRetailPrice) {
        this.totalProductRetailPrice = totalProductRetailPrice;
    }

    public BigDecimal getProductWholeSalePrice() {
        return productWholeSalePrice;
    }

    public void setProductWholeSalePrice(BigDecimal productWholeSalePrice) {
        this.productWholeSalePrice = productWholeSalePrice;
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

    public BigDecimal getTotalProductVolume() {
        return totalProductVolume;
    }

    public void setTotalProductVolume(BigDecimal totalProductVolume) {
        this.totalProductVolume = totalProductVolume;
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public BigDecimal getTotalSellingPrice() {
        return totalSellingPrice;
    }

    public void setTotalSellingPrice(BigDecimal totalSellingPrice) {
        this.totalSellingPrice = totalSellingPrice;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(BigDecimal shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public BigDecimal getHandlingCharge() {
        return handlingCharge;
    }

    public void setHandlingCharge(BigDecimal handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    public String getShippingSource() {
        return shippingSource;
    }

    public void setShippingSource(String shippingSource) {
        this.shippingSource = shippingSource;
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

    public SalesCountry getSalesCountry() {
        return salesCountry;
    }

    public long getShippingOrderAddressID() {
        return shippingOrderAddressID;
    }

    public void setShippingOrderAddressID(long shippingOrderAddressID) {
        this.shippingOrderAddressID = shippingOrderAddressID;
    }

    public long getBillingOrderAddressID() {
        return billingOrderAddressID;
    }

    public void setBillingOrderAddressID(long billingOrderAddressID) {
        this.billingOrderAddressID = billingOrderAddressID;
    }

    public OrderAddress getShppingAddress() {
        return shppingAddress;
    }

    public void setShppingAddress(OrderAddress shppingAddress) {
        this.shppingAddress = shppingAddress;
    }

    public OrderAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(OrderAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setSalesCountry(SalesCountry salesCountry) {
        this.salesCountry = salesCountry;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public PriceTier getPriceTier() {
        return priceTier;
    }

    public void setPriceTier(PriceTier priceTier) {
        this.priceTier = priceTier;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderSource getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(OrderSource orderSource) {
        this.orderSource = orderSource;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
