package com.ns.tbe.model.nodes;

import com.ns.tbe.model.relationships.MemberOrderWiseBonus;
import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Node
public class BonusMaster {
    @Id
    @GeneratedValue
    private Long id;
    private Long operatingCompanyId;
    private int processingYear;
    private int processingMonth;
    private Long BonusCycleId;
    private Long memberId;
    private Long beginningLevelId;
    private Long endingLevelId;

    private BigDecimal personalCC;
    private BigDecimal preferredCustomerCC;
    private BigDecimal activeCC;
    private BigDecimal nonManagerCC;
    private BigDecimal openGroupCC;
    private BigDecimal unencumberedCC;
    private BigDecimal passThruCC;
    private BigDecimal leadershipCC;
    private BigDecimal newCC;
    private BigDecimal totalCC;
    private BigDecimal twoMonthsOpenGroupCC;
    private BigDecimal fourMonthsOpenGroupCC;
    private BigDecimal retailCustomerCC;
    private boolean is4CCActive;

    private BigDecimal personalDiscount;
    private BigDecimal retailCustomerProfit;
    private BigDecimal preferredCustomerProfit;
    private BigDecimal personalBonus;
    private BigDecimal preferredCustomerBonus;
    private BigDecimal volumeBonus;
    private boolean isQualifiedForLeadershipBonus;
    private BigDecimal leadershipBonus;
    private boolean isQualifiedForGemBonus;
    private BigDecimal gemBonus;
    private boolean isQualifiedForForever2DriveBonus;
    private BigDecimal forever2DriveBonus;

    private int noOfNewRCs;
    private int noOfNewFPCs;
    private int noOfNewFBOs;
    private int noOfNewManagersInOpenGroup;
    private int noOfNewManagersInDownline;
    private int noOfNewSupervisors;
    private int noOf25CCManagers;
    private int noOf25CCManagerLines;

    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "bonusOrder", direction = Relationship.Direction.OUTGOING)
    private Map<BonusOrderDetail, MemberOrderWiseBonus> bonusOrderDetails = new HashMap<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public Map<BonusOrderDetail, MemberOrderWiseBonus> getBonusOrderDetails() {
        return bonusOrderDetails;
    }

    public void setBonusOrderDetails(Map<BonusOrderDetail, MemberOrderWiseBonus> bonusOrderDetails) {
        this.bonusOrderDetails = bonusOrderDetails;
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

    public Long getBonusCycleId() {
        return BonusCycleId;
    }

    public void setBonusCycleId(Long bonusCycleId) {
        BonusCycleId = bonusCycleId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBeginningLevelId() {
        return beginningLevelId;
    }

    public void setBeginningLevelId(Long beginningLevelId) {
        this.beginningLevelId = beginningLevelId;
    }

    public Long getEndingLevelId() {
        return endingLevelId;
    }

    public void setEndingLevelId(Long endingLevelId) {
        this.endingLevelId = endingLevelId;
    }

    public BigDecimal getPersonalCC() {
        return personalCC;
    }

    public void setPersonalCC(BigDecimal personalCC) {
        this.personalCC = personalCC;
    }

    public BigDecimal getPreferredCustomerCC() {
        return preferredCustomerCC;
    }

    public void setPreferredCustomerCC(BigDecimal preferredCustomerCC) {
        this.preferredCustomerCC = preferredCustomerCC;
    }

    public BigDecimal getActiveCC() {
        return activeCC;
    }

    public void setActiveCC(BigDecimal activeCC) {
        this.activeCC = activeCC;
    }

    public BigDecimal getNonManagerCC() {
        return nonManagerCC;
    }

    public void setNonManagerCC(BigDecimal nonManagerCC) {
        this.nonManagerCC = nonManagerCC;
    }

    public BigDecimal getOpenGroupCC() {
        return openGroupCC;
    }

    public void setOpenGroupCC(BigDecimal openGroupCC) {
        this.openGroupCC = openGroupCC;
    }

    public BigDecimal getUnencumberedCC() {
        return unencumberedCC;
    }

    public void setUnencumberedCC(BigDecimal unencumberedCC) {
        this.unencumberedCC = unencumberedCC;
    }

    public BigDecimal getPassThruCC() {
        return passThruCC;
    }

    public void setPassThruCC(BigDecimal passThruCC) {
        this.passThruCC = passThruCC;
    }

    public BigDecimal getLeadershipCC() {
        return leadershipCC;
    }

    public void setLeadershipCC(BigDecimal leadershipCC) {
        this.leadershipCC = leadershipCC;
    }

    public BigDecimal getNewCC() {
        return newCC;
    }

    public void setNewCC(BigDecimal newCC) {
        this.newCC = newCC;
    }

    public BigDecimal getTotalCC() {
        return totalCC;
    }

    public void setTotalCC(BigDecimal totalCC) {
        this.totalCC = totalCC;
    }

    public BigDecimal getTwoMonthsOpenGroupCC() {
        return twoMonthsOpenGroupCC;
    }

    public void setTwoMonthsOpenGroupCC(BigDecimal twoMonthsOpenGroupCC) {
        this.twoMonthsOpenGroupCC = twoMonthsOpenGroupCC;
    }

    public BigDecimal getFourMonthsOpenGroupCC() {
        return fourMonthsOpenGroupCC;
    }

    public void setFourMonthsOpenGroupCC(BigDecimal fourMonthsOpenGroupCC) {
        this.fourMonthsOpenGroupCC = fourMonthsOpenGroupCC;
    }

    public BigDecimal getRetailCustomerCC() {
        return retailCustomerCC;
    }

    public void setRetailCustomerCC(BigDecimal retailCustomerCC) {
        this.retailCustomerCC = retailCustomerCC;
    }

    public boolean isIs4CCActive() {
        return is4CCActive;
    }

    public void setIs4CCActive(boolean is4CCActive) {
        this.is4CCActive = is4CCActive;
    }

    public BigDecimal getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(BigDecimal personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

    public BigDecimal getRetailCustomerProfit() {
        return retailCustomerProfit;
    }

    public void setRetailCustomerProfit(BigDecimal retailCustomerProfit) {
        this.retailCustomerProfit = retailCustomerProfit;
    }

    public BigDecimal getPreferredCustomerProfit() {
        return preferredCustomerProfit;
    }

    public void setPreferredCustomerProfit(BigDecimal preferredCustomerProfit) {
        this.preferredCustomerProfit = preferredCustomerProfit;
    }

    public BigDecimal getPersonalBonus() {
        return personalBonus;
    }

    public void setPersonalBonus(BigDecimal personalBonus) {
        this.personalBonus = personalBonus;
    }

    public BigDecimal getPreferredCustomerBonus() {
        return preferredCustomerBonus;
    }

    public void setPreferredCustomerBonus(BigDecimal preferredCustomerBonus) {
        this.preferredCustomerBonus = preferredCustomerBonus;
    }

    public BigDecimal getVolumeBonus() {
        return volumeBonus;
    }

    public void setVolumeBonus(BigDecimal volumeBonus) {
        this.volumeBonus = volumeBonus;
    }

    public boolean isQualifiedForLeadershipBonus() {
        return isQualifiedForLeadershipBonus;
    }

    public void setQualifiedForLeadershipBonus(boolean qualifiedForLeadershipBonus) {
        isQualifiedForLeadershipBonus = qualifiedForLeadershipBonus;
    }

    public BigDecimal getLeadershipBonus() {
        return leadershipBonus;
    }

    public void setLeadershipBonus(BigDecimal leadershipBonus) {
        this.leadershipBonus = leadershipBonus;
    }

    public boolean isQualifiedForGemBonus() {
        return isQualifiedForGemBonus;
    }

    public void setQualifiedForGemBonus(boolean qualifiedForGemBonus) {
        isQualifiedForGemBonus = qualifiedForGemBonus;
    }

    public BigDecimal getGemBonus() {
        return gemBonus;
    }

    public void setGemBonus(BigDecimal gemBonus) {
        this.gemBonus = gemBonus;
    }

    public boolean isQualifiedForForever2DriveBonus() {
        return isQualifiedForForever2DriveBonus;
    }

    public void setQualifiedForForever2DriveBonus(boolean qualifiedForForever2DriveBonus) {
        isQualifiedForForever2DriveBonus = qualifiedForForever2DriveBonus;
    }

    public BigDecimal getForever2DriveBonus() {
        return forever2DriveBonus;
    }

    public void setForever2DriveBonus(BigDecimal forever2DriveBonus) {
        this.forever2DriveBonus = forever2DriveBonus;
    }

    public int getNoOfNewRCs() {
        return noOfNewRCs;
    }

    public void setNoOfNewRCs(int noOfNewRCs) {
        this.noOfNewRCs = noOfNewRCs;
    }

    public int getNoOfNewFPCs() {
        return noOfNewFPCs;
    }

    public void setNoOfNewFPCs(int noOfNewFPCs) {
        this.noOfNewFPCs = noOfNewFPCs;
    }

    public int getNoOfNewFBOs() {
        return noOfNewFBOs;
    }

    public void setNoOfNewFBOs(int noOfNewFBOs) {
        this.noOfNewFBOs = noOfNewFBOs;
    }

    public int getNoOfNewManagersInOpenGroup() {
        return noOfNewManagersInOpenGroup;
    }

    public void setNoOfNewManagersInOpenGroup(int noOfNewManagersInOpenGroup) {
        this.noOfNewManagersInOpenGroup = noOfNewManagersInOpenGroup;
    }

    public int getNoOfNewManagersInDownline() {
        return noOfNewManagersInDownline;
    }

    public void setNoOfNewManagersInDownline(int noOfNewManagersInDownline) {
        this.noOfNewManagersInDownline = noOfNewManagersInDownline;
    }

    public int getNoOfNewSupervisors() {
        return noOfNewSupervisors;
    }

    public void setNoOfNewSupervisors(int noOfNewSupervisors) {
        this.noOfNewSupervisors = noOfNewSupervisors;
    }

    public int getNoOf25CCManagers() {
        return noOf25CCManagers;
    }

    public void setNoOf25CCManagers(int noOf25CCManagers) {
        this.noOf25CCManagers = noOf25CCManagers;
    }

    public int getNoOf25CCManagerLines() {
        return noOf25CCManagerLines;
    }

    public void setNoOf25CCManagerLines(int noOf25CCManagerLines) {
        this.noOf25CCManagerLines = noOf25CCManagerLines;
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
