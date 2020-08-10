package com.ns.tbe.model.relationships;

import org.neo4j.springframework.data.core.schema.RelationshipProperties;

@RelationshipProperties
public class MemberOrder {
    private String salesCountry;
    private boolean isHistory;

    public String getSalesCountry() {
        return salesCountry;
    }

    public void setSalesCountry(String salesCountry) {
        this.salesCountry = salesCountry;
    }

    public boolean isHistory() {
        return isHistory;
    }

    public void setHistory(boolean history) {
        isHistory = history;
    }
}
