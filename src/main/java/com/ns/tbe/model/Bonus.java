package com.ns.tbe.model;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

@Node
public class Bonus {
    @Id
    @GeneratedValue
    private Long Id;
    private Long memberId;
    private int businessEntityId;
    private int beginningLevelId;
    private int endingLevelId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public int getBusinessEntityId() {
        return businessEntityId;
    }

    public void setBusinessEntityId(int businessEntityId) {
        this.businessEntityId = businessEntityId;
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
}
