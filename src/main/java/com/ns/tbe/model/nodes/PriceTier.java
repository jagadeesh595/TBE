package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class PriceTier {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;
    //TODO Need to check above properties
}
