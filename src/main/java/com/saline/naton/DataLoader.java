package com.saline.naton;

import com.saline.naton.entity.Company;
import com.saline.naton.repository.CompanyRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {
    private final CompanyRepository companyRepository;

    public DataLoader(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @PostConstruct
    public void init() {
        if (companyRepository.findAll().isEmpty()) {
            Company company = new Company();
            company.setActive(true);
            company.setName("Natura");
            company.setEmail("natura@natura.com");
            company.setTelephone(111111L);
            company.setComment("primeiro natura");
            companyRepository.save(company);

            company = new Company();
            company.setActive(true);
            company.setName("Avon");
            company.setEmail("avon@avon.com");
            company.setTelephone(222222L);
            company.setComment("primeiro avon");
            companyRepository.save(company);

            company = new Company();
            company.setActive(true);
            company.setName("Jequiti");
            company.setEmail("jequiti@jequiti.com");
            company.setTelephone(333333L);
            company.setComment("primeiro jequiti");
            companyRepository.save(company);
        }
    }
}
