package com.ns.tbe.model;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.math.BigInteger;
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
    private boolean isDefaultAddress;
    private int addressTypeId;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private int stateCode;
    private String countryCode;
    private String postalCode;
    private String lattitude;
    private String longitude;
    private String homePhone;
    private String workPhone;
    private String nomineeName;
    private LocalDateTime nomineeDateOfBirth;
    private int nomineeRelationshipId;
    private LocalDateTime createdDate;
    private BigInteger createdBy;
    private LocalDateTime updatedDate;
    private BigInteger updatedBy;
    private int rowStatusId;

    @Relationship(value = "sponsor", direction = Relationship.Direction.OUTGOING)
    private Map<Member, MemberSponsor> hasSponsor = new HashMap<>();

    @Relationship(value = "ordered", direction = Relationship.Direction.OUTGOING)
    private List<Order> hasOrders = new ArrayList<>();

    @Relationship(value = "bonus", direction = Relationship.Direction.OUTGOING)
    private Map<Bonus, BonusPeriod> hasBonus = new HashMap<>();

    public List<Order> getHasOrders() {
        return hasOrders;
    }

    public boolean isDefaultAddress() {
        return isDefaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        isDefaultAddress = defaultAddress;
    }

    public int getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(int addressTypeId) {
        this.addressTypeId = addressTypeId;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
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

    public void setHasOrders(List<Order> hasOrders) {
        this.hasOrders = hasOrders;
    }

    public Map<Bonus, BonusPeriod> getHasBonus() {
        return hasBonus;
    }

    public void setHasBonus(Map<Bonus, BonusPeriod> hasBonus) {
        this.hasBonus = hasBonus;
    }

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

    public BigInteger getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public BigInteger getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BigInteger updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getRowStatusId() {
        return rowStatusId;
    }

    public void setRowStatusId(int rowStatusId) {
        this.rowStatusId = rowStatusId;
    }

    public Map<Member, MemberSponsor> getHasSponsor() {
        return hasSponsor;
    }

    public void setHasSponsor(Map<Member, MemberSponsor> hasSponsor) {
        this.hasSponsor = hasSponsor;
    }
}
