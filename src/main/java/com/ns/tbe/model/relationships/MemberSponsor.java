package com.ns.tbe.model.relationships;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.RelationshipProperties;

import java.math.BigInteger;
import java.time.LocalDateTime;

@RelationshipProperties
public class MemberSponsor {
    private String salesCountry;

    public String getSalesCountry() {
        return salesCountry;
    }

    public void setSalesCountry(String salesCountry) {
        this.salesCountry = salesCountry;
    }
}

