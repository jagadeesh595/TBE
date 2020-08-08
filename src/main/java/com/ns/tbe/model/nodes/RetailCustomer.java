package com.ns.tbe.model.nodes;

import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Relationship;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Node
public class RetailCustomer {
    @Id
    @GeneratedValue
    private Long id;
    private String retailCustomerNumber;
    private Long referringMemberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long operatingCompanyId;
    private LocalDateTime enrolledDate;
    private int memberStatusId;
    private LocalDateTime dateOfBirth;
    private String emailId;
    private int genderId;
    private int maritalStatusId;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private int stateCode;
    private String countryCode;
    private String postalCode;
    private String latitude;
    private String longitude;
    private String homePhone;
    private String workPhone;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime updatedDate;
    private Long updatedBy;
    private int rowStatusId;

    @Relationship(value = "referringMember", direction = Relationship.Direction.OUTGOING)
    private Member referringMember;

    @Relationship(value = "ordered", direction = Relationship.Direction.OUTGOING)
    private List<Order> hasOrders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRetailCustomerNumber() {
        return retailCustomerNumber;
    }

    public void setRetailCustomerNumber(String retailCustomerNumber) {
        this.retailCustomerNumber = retailCustomerNumber;
    }

    public Long getReferringMemberId() {
        return referringMemberId;
    }

    public void setReferringMemberId(Long referringMemberId) {
        this.referringMemberId = referringMemberId;
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

    public List<Order> getHasOrders() {
        return hasOrders;
    }

    public void setHasOrders(List<Order> hasOrders) {
        this.hasOrders = hasOrders;
    }

    public Member getReferringMember() {
        return referringMember;
    }

    public void setReferringMember(Member referringMember) {
        this.referringMember = referringMember;
    }
}
