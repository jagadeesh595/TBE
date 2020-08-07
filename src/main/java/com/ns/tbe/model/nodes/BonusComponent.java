package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.time.LocalDateTime;

@Node
public class BonusComponent {
    @Id
    @GeneratedValue
    private Long id;
    private Long memberId;
    private Long bonusComponentConfigId;
    private int processinMonth;
    private int processingyear;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private Long rowStatusId;


    @Relationship(value = "bonusComponentConfig", direction = Relationship.Direction.OUTGOING)
    BonusComponentConfig bonusComponentConfig = new BonusComponentConfig();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBonuscomponentId() {
        return bonuscomponentId;
    }

    public void setBonuscomponentId(Long bonuscomponentId) {
        this.bonuscomponentId = bonuscomponentId;
    }

    public int getProcessinMonth() {
        return processinMonth;
    }

    public void setProcessinMonth(int processinMonth) {
        this.processinMonth = processinMonth;
    }

    public int getProcessingyear() {
        return processingyear;
    }

    public void setProcessingyear(int processingyear) {
        this.processingyear = processingyear;
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