package com.ns.tbe.model.nodes;

import com.ns.tbe.model.relationships.BonusPeriod;
import com.ns.tbe.model.relationships.MemberSponsor;
import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Node
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String emailId;
    private int genderId;
    private int maritalStatusId;
    private Long operatingCompanyId;
    private LocalDateTime enrolledDate;
    private int memberStatusId;
    private int memberTypeId;
    private int rankLevelId;
    private int workingRankLevelId;
    private boolean isForeignMember;
    private boolean isInheritedManager;
    private boolean isTransferredManager;
    private boolean isDefaultAddress;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private int stateCode;
    private String country;
    private String postalCode;
    private String latitude;
    private String longitude;
    private String homePhone;
    private String workPhone;
    private String nomineeName;
    private LocalDateTime nomineeDateOfBirth;
    private int nomineeRelationshipId;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "sponsoredBy", direction = Relationship.Direction.OUTGOING)
    private Map<Member, MemberSponsor> sponsors = new HashMap<>();

    @Relationship(value = "ordered", direction = Relationship.Direction.OUTGOING)
    private List<Order> orders = new ArrayList<>();

    @Relationship(value = "bonus", direction = Relationship.Direction.OUTGOING)
    private Map<BonusMaster, BonusPeriod> bonusDetails = new HashMap<>();

    @Relationship(value = "bonusHistory", direction = Relationship.Direction.OUTGOING)
    private Map<BonusHistory, BonusPeriod> bonusHistory = new HashMap<>();

    @Relationship(value = "bonusOrders", direction = Relationship.Direction.OUTGOING)
    private List<BonusOrderDetail> bonusOrderDetails = new ArrayList<>();

    @Relationship(value = "bonusAdjustments", direction = Relationship.Direction.OUTGOING)
    private List<BonusAdjustment> bonusAdjustments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public int getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(int maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public Long getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public void setOperatingCompanyId(Long operatingCompanyId) {
        this.operatingCompanyId = operatingCompanyId;
    }

    public LocalDateTime getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(LocalDateTime enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public int getMemberStatusId() {
        return memberStatusId;
    }

    public void setMemberStatusId(int memberStatusId) {
        this.memberStatusId = memberStatusId;
    }

    public int getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(int memberTypeId) {
        this.memberTypeId = memberTypeId;
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

    public boolean isDefaultAddress() {
        return isDefaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        isDefaultAddress = defaultAddress;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public LocalDateTime getNomineeDateOfBirth() {
        return nomineeDateOfBirth;
    }

    public void setNomineeDateOfBirth(LocalDateTime nomineeDateOfBirth) {
        this.nomineeDateOfBirth = nomineeDateOfBirth;
    }

    public int getNomineeRelationshipId() {
        return nomineeRelationshipId;
    }

    public void setNomineeRelationshipId(int nomineeRelationshipId) {
        this.nomineeRelationshipId = nomineeRelationshipId;
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

    public Map<Member, MemberSponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Map<Member, MemberSponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Map<BonusMaster, BonusPeriod> getBonusDetails() {
        return bonusDetails;
    }

    public void setBonusDetails(Map<BonusMaster, BonusPeriod> bonusDetails) {
        this.bonusDetails = bonusDetails;
    }

    public Map<BonusHistory, BonusPeriod> getBonusHistory() {
        return bonusHistory;
    }

    public void setBonusHistory(Map<BonusHistory, BonusPeriod> bonusHistory) {
        this.bonusHistory = bonusHistory;
    }

    public List<BonusOrderDetail> getBonusOrderDetails() {
        return bonusOrderDetails;
    }

    public void setBonusOrderDetails(List<BonusOrderDetail> bonusOrderDetails) {
        this.bonusOrderDetails = bonusOrderDetails;
    }

    public List<BonusAdjustment> getBonusAdjustments() {
        return bonusAdjustments;
    }

    public void setBonusAdjustments(List<BonusAdjustment> bonusAdjustments) {
        this.bonusAdjustments = bonusAdjustments;
    }
}
