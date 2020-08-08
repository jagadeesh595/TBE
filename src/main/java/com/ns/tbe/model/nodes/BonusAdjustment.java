package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Node
public class BonusAdjustment {
    @Id
    @GeneratedValue
    private Long id;
    private Long operatingCompanyId;
    private Long memberId;
    private Long orderId;
    private int processingYear;
    private int processingMonth;
    private int adjustmentYear;
    private int adjustmentMonth;
    private Long adjustmentCodeId;
    private BigDecimal adjustmentAmount;
    private BigDecimal adjustmentCC;
    private Long adjustmentLevelId;
    private BigDecimal errorAmount;
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

    public Long getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public void setOperatingCompanyId(Long operatingCompanyId) {
        this.operatingCompanyId = operatingCompanyId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public int getAdjustmentYear() {
        return adjustmentYear;
    }

    public void setAdjustmentYear(int adjustmentYear) {
        this.adjustmentYear = adjustmentYear;
    }

    public int getAdjustmentMonth() {
        return adjustmentMonth;
    }

    public void setAdjustmentMonth(int adjustmentMonth) {
        this.adjustmentMonth = adjustmentMonth;
    }

    public Long getAdjustmentId() {
        return adjustmentCodeId;
    }

    public void setAdjustmentId(Long adjustmentId) {
        this.adjustmentCodeId = adjustmentId;
    }

    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public BigDecimal getAdjustmentCC() {
        return adjustmentCC;
    }

    public void setAdjustmentCC(BigDecimal adjustmentCC) {
        this.adjustmentCC = adjustmentCC;
    }

    public Long getAdjustmentLevelId() {
        return adjustmentLevelId;
    }

    public void setAdjustmentLevelId(Long adjustmentLevelId) {
        this.adjustmentLevelId = adjustmentLevelId;
    }

    public BigDecimal getErrorAmount() {
        return errorAmount;
    }

    public void setErrorAmount(BigDecimal errorAmount) {
        this.errorAmount = errorAmount;
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
