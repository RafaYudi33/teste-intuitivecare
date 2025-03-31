package org.rafs.intuitivacareback.infra.persistence.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.time.LocalDate;
import java.util.Objects;


public class OperatorCsv {
    @CsvBindByName(column = "Registro_ANS")
    private String ansRegistry;

    @CsvBindByName(column = "CNPJ")
    private String cnpj;

    @CsvBindByName(column = "Razao_Social")
    private String corporateName;

    @CsvBindByName(column = "Nome_Fantasia")
    private String tradeName;

    @CsvBindByName(column = "Modalidade")
    private String type;

    @CsvBindByName(column = "Logradouro")
    private String street;

    @CsvBindByName(column = "Numero")
    private String number;

    @CsvBindByName(column = "Complemento")
    private String complement;

    @CsvBindByName(column = "Bairro")
    private String neighborhood;

    @CsvBindByName(column = "Cidade")
    private String city;

    @CsvBindByName(column = "UF")
    private String state;

    @CsvBindByName(column = "CEP")
    private String zipCode;

    @CsvBindByName(column = "DDD")
    private String areaCode;

    @CsvBindByName(column = "Telefone")
    private String phone;

    @CsvBindByName(column = "Fax")
    private String fax;

    @CsvBindByName(column = "Endereco_eletronico")
    private String email;

    @CsvBindByName(column = "Representante")
    private String representative;

    @CsvBindByName(column = "Cargo_Representante")
    private String representativeRole;

    @CsvBindByName(column = "Regiao_de_Comercializacao")
    private Integer marketingRegion;

    @CsvBindByName(column = "Data_Registro_ANS")
    @CsvDate("yyyy-MM-dd")
    private LocalDate ansRegistrationDate;


    public OperatorCsv(String ansRegistry, String cnpj, String corporateName, String tradeName, String type, String street, String number, String complement, String neighborhood, String city, String state, String zipCode, String areaCode, String phone, String fax, String email, String representative, String representativeRole, Integer marketingRegion, LocalDate ansRegistrationDate) {
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

    public OperatorCsv(){}


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
        if (!(o instanceof OperatorCsv that)) return false;
        return Objects.equals(getAnsRegistry(), that.getAnsRegistry()) && Objects.equals(getCnpj(), that.getCnpj()) && Objects.equals(getCorporateName(), that.getCorporateName()) && Objects.equals(getTradeName(), that.getTradeName()) && Objects.equals(getType(), that.getType()) && Objects.equals(getStreet(), that.getStreet()) && Objects.equals(getNumber(), that.getNumber()) && Objects.equals(getComplement(), that.getComplement()) && Objects.equals(getNeighborhood(), that.getNeighborhood()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getState(), that.getState()) && Objects.equals(getZipCode(), that.getZipCode()) && Objects.equals(getAreaCode(), that.getAreaCode()) && Objects.equals(getPhone(), that.getPhone()) && Objects.equals(getFax(), that.getFax()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getRepresentative(), that.getRepresentative()) && Objects.equals(getRepresentativeRole(), that.getRepresentativeRole()) && Objects.equals(getMarketingRegion(), that.getMarketingRegion()) && Objects.equals(getAnsRegistrationDate(), that.getAnsRegistrationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnsRegistry(), getCnpj(), getCorporateName(), getTradeName(), getType(), getStreet(), getNumber(), getComplement(), getNeighborhood(), getCity(), getState(), getZipCode(), getAreaCode(), getPhone(), getFax(), getEmail(), getRepresentative(), getRepresentativeRole(), getMarketingRegion(), getAnsRegistrationDate());
    }

    @Override
    public String toString() {
        return "OperatorCsv{" +
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
