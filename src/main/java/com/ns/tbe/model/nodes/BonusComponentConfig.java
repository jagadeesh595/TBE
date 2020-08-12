package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class BonusComponentConfig {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String shortCode;
    private String description;
    private Long bonusVolumeId;
    private Long compensationPlanBonusTypeId;
    private Long compensationPlanCompressionTypeId;
    private Boolean isAggregation;
    private Long businessEntityId;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private Long rowStatusId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBonusVolumeId() {
        return bonusVolumeId;
    }

    public void setBonusVolumeId(Long bonusVolumeId) {
        this.bonusVolumeId = bonusVolumeId;
    }

    public Long getCompensationPlanBonusTypeId() {
        return compensationPlanBonusTypeId;
    }

    public void setCompensationPlanBonusTypeId(Long compensationPlanBonusTypeId) {
        this.compensationPlanBonusTypeId = compensationPlanBonusTypeId;
    }

    public Long getCompensationPlanCompressionTypeId() {
        return compensationPlanCompressionTypeId;
    }

    public void setCompensationPlanCompressionTypeId(Long compensationPlanCompressionTypeId) {
        this.compensationPlanCompressionTypeId = compensationPlanCompressionTypeId;
    }

    public Boolean getAggregation() {
        return isAggregation;
    }

    public void setAggregation(Boolean aggregation) {
        isAggregation = aggregation;
    }

    public Long getBusinessEntityId() {
        return businessEntityId;
    }

    public void setBusinessEntityId(Long businessEntityId) {
        this.businessEntityId = businessEntityId;
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

    public Long getRowStatusId() {
        return rowStatusId;
    }

    public void setRowStatusId(Long rowStatusId) {
        this.rowStatusId = rowStatusId;
    }
}
