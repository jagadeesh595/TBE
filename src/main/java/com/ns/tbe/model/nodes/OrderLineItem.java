package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Node
public class OrderLineItem {
    @Id
    @GeneratedValue
    private Long id;
    private long orderID;
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

    @Relationship(value = "orderLineItemHistory", direction = Relationship.Direction.OUTGOING)
    List<OrderLineItemHistory> orderLineItemHistory = new ArrayList<>();
}
