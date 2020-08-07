package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigDecimal;

@Node
public class BonusHistoryDetail {
    @Id
    @GeneratedValue
    private Long id;
    private Long bonusId;
    private int bonusComponentId;
    private BigDecimal bonusVolume;
    private int rowStatusId;

    @Relationship(value = "bonusComponent", direction = Relationship.Direction.OUTGOING)
    BonusComponent bonusComponent = new BonusComponent();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBonusId() {
        return bonusId;
    }

    public void setBonusId(Long bonusId) {
        this.bonusId = bonusId;
    }

    public int getBonusComponentId() {
        return bonusComponentId;
    }

    public void setBonusComponentId(int bonusComponentId) {
        this.bonusComponentId = bonusComponentId;
    }

    public BigDecimal getBonusVolume() {
        return bonusVolume;
    }

    public void setBonusVolume(BigDecimal bonusVolume) {
        this.bonusVolume = bonusVolume;
    }

    public int getRowStatusId() {
        return rowStatusId;
    }

    public void setRowStatusId(int rowStatusId) {
        this.rowStatusId = rowStatusId;
    }

    public BonusComponent getBonusComponent() {
        return bonusComponent;
    }

    public void setBonusComponent(BonusComponent bonusComponent) {
        this.bonusComponent = bonusComponent;
    }
}
