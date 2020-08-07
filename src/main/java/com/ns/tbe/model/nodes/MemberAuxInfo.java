package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Node
public class MemberAuxInfo {
    @Id
    @GeneratedValue
    private Long id;
    private Long memberId;
    private int countryId;
    private int memberTypeId;
    private int rankLevelId;
    private int workingRankLevelId;
    private boolean isForeignMember;
    private boolean isInheritedManager;
    private boolean isTransferredManager;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "memberType", direction = Relationship.Direction.OUTGOING)
    MemberType memberType=new MemberType();

    @Relationship(value = "rankLevel", direction = Relationship.Direction.OUTGOING)
    MemberRankLevel rankLevel=new MemberRankLevel();

    @Relationship(value = "workingRankLevel", direction = Relationship.Direction.OUTGOING)
    MemberRankLevel workingRankLevel=new MemberRankLevel();

    @Relationship(value = "homeCountry", direction = Relationship.Direction.OUTGOING)
    Country homeCountry=new Country();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(int memberTypeId) {
        this.memberTypeId = memberTypeId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getRankLevelId() {
        return rankLevelId;
    }

    public void setRankLevelId(int rankLevelId) {
        this.rankLevelId = rankLevelId;
    }

    public int getWorkingRankLevelId() {
        return workingRankLevelId;
    }

    public void setWorkingRankLevelId(int workingRankLevelId) {
        this.workingRankLevelId = workingRankLevelId;
    }

    public boolean isForeignMember() {
        return isForeignMember;
    }

    public void setForeignMember(boolean foreignMember) {
        isForeignMember = foreignMember;
    }

    public boolean isInheritedManager() {
        return isInheritedManager;
    }

    public void setInheritedManager(boolean inheritedManager) {
        isInheritedManager = inheritedManager;
    }

    public boolean isTransferredManager() {
        return isTransferredManager;
    }

    public void setTransferredManager(boolean transferredManager) {
        isTransferredManager = transferredManager;
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

    public MemberRankLevel getRankLevel() {
        return rankLevel;
    }

    public void setRankLevel(MemberRankLevel rankLevel) {
        this.rankLevel = rankLevel;
    }

    public MemberRankLevel getWorkingRankLevel() {
        return workingRankLevel;
    }

    public void setWorkingRankLevel(MemberRankLevel workingRankLevel) {
        this.workingRankLevel = workingRankLevel;
    }

    public Country getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(Country homeCountry) {
        this.homeCountry = homeCountry;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}
