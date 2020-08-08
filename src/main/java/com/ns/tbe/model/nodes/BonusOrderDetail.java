package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Node
public class BonusOrderDetail {
    @Id
    @GeneratedValue
    private Long id;
    private int operatingCompanyId;
    private int processingYear;
    private int processingMonth;
    private int BonusCycleId;
    private Long memberId;
    private Long memberSponsorId;
    private Long orderId;
    private Long orderLineItemId;

    private BigDecimal personalCC;
    private BigDecimal preferredCustomerCC;
    private BigDecimal activeCC;
    private BigDecimal nonManagerCC;
    private BigDecimal retailCustomerCC;

    private BigDecimal personalDiscount;
    private BigDecimal retailCustomerProfit;
    private BigDecimal preferredCustomerProfit;
    private BigDecimal personalBonus;
    private BigDecimal preferredCustomerBonus;
    private BigDecimal volumeBonus;

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

    public int getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public void setOperatingCompanyId(int operatingCompanyId) {
        this.operatingCompanyId = operatingCompanyId;
    }

    public int getProcessingYear() {
        return processingYear;
    }

    public void setProcessingYear(int processingYear) {
        this.processingYear = processingYear;
    }

    public int getProcessingMonth() {
        return processingMonth;
    }

    public void setProcessingMonth(int processingMonth) {
        this.processingMonth = processingMonth;
    }

    public int getBonusCycleId() {
        return BonusCycleId;
    }

    public void setBonusCycleId(int bonusCycleId) {
        BonusCycleId = bonusCycleId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getMemberSponsorId() {
        return memberSponsorId;
    }

    public void setMemberSponsorId(Long memberSponsorId) {
        this.memberSponsorId = memberSponsorId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(Long orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
    }

    public BigDecimal getPersonalCC() {
        return personalCC;
    }

    public void setPersonalCC(BigDecimal personalCC) {
        this.personalCC = personalCC;
    }

    public BigDecimal getPreferredCustomerCC() {
        return preferredCustomerCC;
    }

    public void setPreferredCustomerCC(BigDecimal preferredCustomerCC) {
        this.preferredCustomerCC = preferredCustomerCC;
    }

    public BigDecimal getActiveCC() {
        return activeCC;
    }

    public void setActiveCC(BigDecimal activeCC) {
        this.activeCC = activeCC;
    }

    public BigDecimal getNonManagerCC() {
        return nonManagerCC;
    }

    public void setNonManagerCC(BigDecimal nonManagerCC) {
        this.nonManagerCC = nonManagerCC;
    }

    public BigDecimal getRetailCustomerCC() {
        return retailCustomerCC;
    }

    public void setRetailCustomerCC(BigDecimal retailCustomerCC) {
        this.retailCustomerCC = retailCustomerCC;
    }

    public BigDecimal getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(BigDecimal personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

    public BigDecimal getRetailCustomerProfit() {
        return retailCustomerProfit;
    }

    public void setRetailCustomerProfit(BigDecimal retailCustomerProfit) {
        this.retailCustomerProfit = retailCustomerProfit;
    }

    public BigDecimal getPreferredCustomerProfit() {
        return preferredCustomerProfit;
    }

    public void setPreferredCustomerProfit(BigDecimal preferredCustomerProfit) {
        this.preferredCustomerProfit = preferredCustomerProfit;
    }

    public BigDecimal getPersonalBonus() {
        return personalBonus;
    }

    public void setPersonalBonus(BigDecimal personalBonus) {
        this.personalBonus = personalBonus;
    }

    public BigDecimal getPreferredCustomerBonus() {
        return preferredCustomerBonus;
    }

    public void setPreferredCustomerBonus(BigDecimal preferredCustomerBonus) {
        this.preferredCustomerBonus = preferredCustomerBonus;
    }

    public BigDecimal getVolumeBonus() {
        return volumeBonus;
    }

    public void setVolumeBonus(BigDecimal volumeBonus) {
        this.volumeBonus = volumeBonus;
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
