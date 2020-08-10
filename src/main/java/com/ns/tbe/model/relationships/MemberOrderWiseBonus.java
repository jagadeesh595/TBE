package com.ns.tbe.model.relationships;

import org.neo4j.springframework.data.core.schema.RelationshipProperties;

@RelationshipProperties
public class MemberOrderWiseBonus {
    private String salesCountry;

    public String getSalesCountry() {
        return salesCountry;
    }

    public void setSalesCountry(String salesCountry) {
        this.salesCountry = salesCountry;
    }
}
