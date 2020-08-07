package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class SalesCountry {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String aliasName;
    private int homeCountryID;
    private int timeZoneId;
    private int dateFormatId;
    private int timeFormatId;
    private int currencyId;
    private int currencyDisplayFormatId;
    private int thousandSeperatorID;
    private int decimalSeparatorID;
    private int numberOfDecimal;
    private Boolean global;
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

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public int getHomeCountryID() {
        return homeCountryID;
    }

    public void setHomeCountryID(int homeCountryID) {
        this.homeCountryID = homeCountryID;
    }

    public int getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public int getDateFormatId() {
        return dateFormatId;
    }

    public void setDateFormatId(int dateFormatId) {
        this.dateFormatId = dateFormatId;
    }

    public int getTimeFormatId() {
        return timeFormatId;
    }

    public void setTimeFormatId(int timeFormatId) {
        this.timeFormatId = timeFormatId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getCurrencyDisplayFormatId() {
        return currencyDisplayFormatId;
    }

    public void setCurrencyDisplayFormatId(int currencyDisplayFormatId) {
        this.currencyDisplayFormatId = currencyDisplayFormatId;
    }

    public int getThousandSeperatorID() {
        return thousandSeperatorID;
    }

    public void setThousandSeperatorID(int thousandSeperatorID) {
        this.thousandSeperatorID = thousandSeperatorID;
    }

    public int getDecimalSeparatorID() {
        return decimalSeparatorID;
    }

    public void setDecimalSeparatorID(int decimalSeparatorID) {
        this.decimalSeparatorID = decimalSeparatorID;
    }

    public int getNumberOfDecimal() {
        return numberOfDecimal;
    }

    public void setNumberOfDecimal(int numberOfDecimal) {
        this.numberOfDecimal = numberOfDecimal;
    }

    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
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
