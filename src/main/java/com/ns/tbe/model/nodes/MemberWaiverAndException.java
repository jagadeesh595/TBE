package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class MemberWaiverAndException {
    @Id
    @GeneratedValue
    private Long id;
    private Long operatingCompanyId;
    private int processingYear;
    private int processingMonth;
    private boolean is4CCActiveWaiver;
    private boolean isLeadershipBonusQualifiedWaiver;
    private boolean is25CCWaiver;
    private Long eagleManagerExceptionId;
    private Long chairmanBonusExceptionId;
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

    public Long getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public void setOperatingCompanyId(Long operatingCompanyId) {
        this.operatingCompanyId = operatingCompanyId;
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

    public boolean isIs4CCActiveWaiver() {
        return is4CCActiveWaiver;
    }

    public void setIs4CCActiveWaiver(boolean is4CCActiveWaiver) {
        this.is4CCActiveWaiver = is4CCActiveWaiver;
    }

    public boolean isLeadershipBonusQualifiedWaiver() {
        return isLeadershipBonusQualifiedWaiver;
    }

    public void setLeadershipBonusQualifiedWaiver(boolean leadershipBonusQualifiedWaiver) {
        isLeadershipBonusQualifiedWaiver = leadershipBonusQualifiedWaiver;
    }

    public boolean isIs25CCWaiver() {
        return is25CCWaiver;
    }

    public void setIs25CCWaiver(boolean is25CCWaiver) {
        this.is25CCWaiver = is25CCWaiver;
    }

    public Long getEagleManagerExceptionId() {
        return eagleManagerExceptionId;
    }

    public void setEagleManagerExceptionId(Long eagleManagerExceptionId) {
        this.eagleManagerExceptionId = eagleManagerExceptionId;
    }

    public Long getChairmanBonusExceptionId() {
        return chairmanBonusExceptionId;
    }

    public void setChairmanBonusExceptionId(Long chairmanBonusExceptionId) {
        this.chairmanBonusExceptionId = chairmanBonusExceptionId;
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
