package com.saline.naton.dto;

import com.saline.naton.entity.Address;

import java.util.Set;

public class CompanyDTO {
    private Long id;
    private String name;
    private String email;
    private Long telephone;
    private Boolean active;
    private String cnpj;
    private String comment;
    private Set<Address> listAddress;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Address> getListAddress() {
        return listAddress;
    }

    public void setListAddress(Set<Address> listAddress) {
        this.listAddress = listAddress;
    }

    public CompanyDTO() {
    }

    private CompanyDTO(CompanyDTOBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.telephone = builder.telephone;
        this.active = builder.active;
        this.cnpj = builder.cnpj;
        this.comment = builder.comment;
        this.listAddress = builder.listAddress;
    }

    public static class CompanyDTOBuilder {
        private final Long id;
        private final String name;
        private String email;
        private Long telephone;
        private Boolean active;
        private String cnpj;
        private String comment;
        private Set<Address> listAddress;

        public CompanyDTOBuilder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public CompanyDTOBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CompanyDTOBuilder withTelephone(Long telephone) {
            this.telephone = telephone;
            return this;
        }

        public CompanyDTOBuilder withActive(Boolean active) {
            this.active = active;
            return this;
        }

        public CompanyDTOBuilder withCnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public CompanyDTOBuilder withComment(String comment) {
            this.comment = comment;
            return this;
        }

        public CompanyDTOBuilder withListAddress(Set<Address> listAddress) {
            this.listAddress = listAddress;
            return this;
        }

        public CompanyDTO build() {
            return new CompanyDTO(this);
        }
    }

}
