package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String iSOCodeTwo;
    private String iSOCodeThree;
    private Boolean global;
    private Boolean territory;
    private int regionID;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiSOCodeTwo() {
        return iSOCodeTwo;
    }

    public void setiSOCodeTwo(String iSOCodeTwo) {
        this.iSOCodeTwo = iSOCodeTwo;
    }

    public String getiSOCodeThree() {
        return iSOCodeThree;
    }

    public void setiSOCodeThree(String iSOCodeThree) {
        this.iSOCodeThree = iSOCodeThree;
    }

    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    public Boolean getTerritory() {
        return territory;
    }

    public void setTerritory(Boolean territory) {
        this.territory = territory;
    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
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
}

