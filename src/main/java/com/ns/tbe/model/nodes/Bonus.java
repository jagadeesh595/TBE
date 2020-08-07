package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Node("Bonus")
public class Bonus {
    @Id
    @GeneratedValue
    private Long id;
    private int businessEntityId;
    private int processingYear;
    private int processingMonth;
    private int BonusCycleId;
    private Long memberId;
    private int beginningLevelId;
    private int endingLevelId;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "bonusDetails", direction = Relationship.Direction.OUTGOING)
    List<BonusDetail> bonusDetails = new ArrayList<>();

    @Relationship(value = "bonusQualifications", direction = Relationship.Direction.OUTGOING)
    List<BonusQualification> bonusQualifications = new ArrayList<>();

    @Relationship(value = "bonusCycle", direction = Relationship.Direction.OUTGOING)
    BonusCycle bonusCycle = new BonusCycle();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBusinessEntityId() {
        return businessEntityId;
    }

    public void setBusinessEntityId(int businessEntityId) {
        this.businessEntityId = businessEntityId;
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

    public int getBeginningLevelId() {
        return beginningLevelId;
    }

    public void setBeginningLevelId(int beginningLevelId) {
        this.beginningLevelId = beginningLevelId;
    }

    public int getEndingLevelId() {
        return endingLevelId;
    }

    public void setEndingLevelId(int endingLevelId) {
        this.endingLevelId = endingLevelId;
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

    public List<BonusDetail> getBonusDetails() {
        return bonusDetails;
    }

    public void setBonusDetails(List<BonusDetail> bonusDetails) {
        this.bonusDetails = bonusDetails;
    }

    public List<BonusQualification> getBonusQualifications() {
        return bonusQualifications;
    }

    public void setBonusQualifications(List<BonusQualification> bonusQualifications) {
        this.bonusQualifications = bonusQualifications;
    }

    public BonusCycle getBonusCycle() {
        return bonusCycle;
    }

    public void setBonusCycle(BonusCycle bonusCycle) {
        this.bonusCycle = bonusCycle;
    }
}
