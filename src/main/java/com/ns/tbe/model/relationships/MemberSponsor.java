package com.ns.tbe.model.relationships;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.RelationshipProperties;

import java.math.BigInteger;
import java.time.LocalDateTime;

@RelationshipProperties
public class MemberSponsor {
    private String salesCountry;
    private LocalDateTime enrolledDate;
    private int memberStatusId;

    public String getSalesCountry() {
        return salesCountry;
    }

    public void setSalesCountry(String salesCountry) {
        this.salesCountry = salesCountry;
    }

    public LocalDateTime getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(LocalDateTime enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public int getMemberStatusId() {
        return memberStatusId;
    }

    public void setMemberStatusId(int memberStatusId) {
        this.memberStatusId = memberStatusId;
    }
}
