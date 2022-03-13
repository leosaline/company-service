package com.saline.naton.mapper;

import com.saline.naton.dto.CompanyDTO;
import com.saline.naton.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public CompanyDTO toDto(Company company) {
        return new CompanyDTO.CompanyDTOBuilder(company.getId(), company.getName())
                .withActive(company.getActive())
                .withCnpj(company.getCnpj())
                .withComment(company.getComment())
                .withEmail(company.getEmail())
                .withListAddress(company.getListAddress())
                .withTelephone(company.getTelephone())
                .build();
    }

    public Company toCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setId(companyDTO.getId());
        company.setName(companyDTO.getName());
        company.setEmail(company.getEmail());
        company.setTelephone(companyDTO.getTelephone());
        company.setActive(companyDTO.getActive());
        company.setCnpj(companyDTO.getCnpj());
        company.setComment(companyDTO.getComment());
        company.setListAddress(companyDTO.getListAddress());
        return company;
    }
}
