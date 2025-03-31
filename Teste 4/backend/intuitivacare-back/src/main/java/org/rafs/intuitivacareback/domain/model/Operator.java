package org.rafs.intuitivacareback.domain.model;

import java.time.LocalDate;
import java.util.Objects;


public class Operator {

    private String ansRegistry;
    private String cnpj;
    private String corporateName;
    private String tradeName;
    private String type;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;
    private String areaCode;
    private String phone;
    private String fax;
    private String email;
    private String representative;
    private String representativeRole;
    private Integer marketingRegion;
    private LocalDate ansRegistrationDate;

    public Operator() {
    }

    public Operator(String ansRegistry, String cnpj, String corporateName, String tradeName, String type, String street, String number, String complement, String neighborhood, String city, String state, String zipCode, String areaCode, String phone, String fax, String email, String representative, String representativeRole, Integer marketingRegion, LocalDate ansRegistrationDate) {
        this.ansRegistry = ansRegistry;
        this.cnpj = cnpj;
        this.corporateName = corporateName;
        this.tradeName = tradeName;
        this.type = type;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.areaCode = areaCode;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.representative = representative;
        this.representativeRole = representativeRole;
        this.marketingRegion = marketingRegion;
        this.ansRegistrationDate = ansRegistrationDate;
    }

    public String getAnsRegistry() {
        return ansRegistry;
    }

    public void setAnsRegistry(String ansRegistry) {
        this.ansRegistry = ansRegistry;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getRepresentativeRole() {
        return representativeRole;
    }

    public void setRepresentativeRole(String representativeRole) {
        this.representativeRole = representativeRole;
    }

    public Integer getMarketingRegion() {
        return marketingRegion;
    }

    public void setMarketingRegion(Integer marketingRegion) {
        this.marketingRegion = marketingRegion;
    }

    public LocalDate getAnsRegistrationDate() {
        return ansRegistrationDate;
    }

    public void setAnsRegistrationDate(LocalDate ansRegistrationDate) {
        this.ansRegistrationDate = ansRegistrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operator operator)) return false;
        return Objects.equals(getAnsRegistry(), operator.getAnsRegistry()) && Objects.equals(getCnpj(), operator.getCnpj()) && Objects.equals(getCorporateName(), operator.getCorporateName()) && Objects.equals(getTradeName(), operator.getTradeName()) && Objects.equals(getType(), operator.getType()) && Objects.equals(getStreet(), operator.getStreet()) && Objects.equals(getNumber(), operator.getNumber()) && Objects.equals(getComplement(), operator.getComplement()) && Objects.equals(getNeighborhood(), operator.getNeighborhood()) && Objects.equals(getCity(), operator.getCity()) && Objects.equals(getState(), operator.getState()) && Objects.equals(getZipCode(), operator.getZipCode()) && Objects.equals(getAreaCode(), operator.getAreaCode()) && Objects.equals(getPhone(), operator.getPhone()) && Objects.equals(getFax(), operator.getFax()) && Objects.equals(getEmail(), operator.getEmail()) && Objects.equals(getRepresentative(), operator.getRepresentative()) && Objects.equals(getRepresentativeRole(), operator.getRepresentativeRole()) && Objects.equals(getMarketingRegion(), operator.getMarketingRegion()) && Objects.equals(getAnsRegistrationDate(), operator.getAnsRegistrationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnsRegistry(), getCnpj(), getCorporateName(), getTradeName(), getType(), getStreet(), getNumber(), getComplement(), getNeighborhood(), getCity(), getState(), getZipCode(), getAreaCode(), getPhone(), getFax(), getEmail(), getRepresentative(), getRepresentativeRole(), getMarketingRegion(), getAnsRegistrationDate());
    }

    @Override
    public String toString() {
        return "Operator{" +
                "ansRegistry='" + ansRegistry + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", type='" + type + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", representative='" + representative + '\'' +
                ", representativeRole='" + representativeRole + '\'' +
                ", marketingRegion=" + marketingRegion +
                ", ansRegistrationDate=" + ansRegistrationDate +
                '}';
    }
}
