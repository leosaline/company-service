package com.saline.naton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.saline.naton.entity.Company;
import com.saline.naton.repository.CompanyRepository;

@Component
public class DataLoader implements ApplicationRunner{

	 private CompanyRepository repo;

	    @Autowired
	    public DataLoader(CompanyRepository repo) {
	        this.repo = repo;
	    }

	    public void run(ApplicationArguments args) {
	    	Company company = new Company();
	    	company.setId(1L);
	    	company.setActive(true);
	    	company.setName("Natura");
	    	company.setEmail("natura@natura.com");
	    	company.setTelephone(111111L);
	    	company.setComment("primeiro natura");
	        repo.save(company);
	        
	    	company = new Company();
	    	company.setId(2L);
	    	company.setActive(true);
	    	company.setName("Avon");
	    	company.setEmail("avon@avon.com");
	    	company.setTelephone(222222L);
	    	company.setComment("primeiro avon");
	        repo.save(company);
	        
	    	company = new Company();
	    	company.setId(3L);
	    	company.setActive(true);
	    	company.setName("Jequiti");
	    	company.setEmail("jequiti@jequiti.com");
	    	company.setTelephone(333333L);
	    	company.setComment("primeiro jequiti");
	        repo.save(company);
	    }
}
