package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.math.BigDecimal;

@Node
public class BonusOrderDetail {
    @Id
    @GeneratedValue
    private Long id;
    private int businessEntityId;
    private int processingYear;
    private int processingMonth;
    private int BonusCycleId;
    private Long memberId;
    private Long memberSponsorId;
    private Long orderId;
    private Long orderLineItemId;
    private int bonusComponentId;
    private BigDecimal bonusVolume;

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
}
