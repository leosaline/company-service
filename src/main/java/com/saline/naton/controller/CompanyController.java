package com.saline.naton.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saline.naton.entity.Company;
import com.saline.naton.repository.CompanyRepository;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CompanyController {

	@Autowired
	private CompanyRepository repo;

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return list of companies") })
	@GetMapping(value = "/companies", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Collection<Company>> listProducts() {
		return ResponseEntity.ok((Collection<Company>) this.repo.findAll());
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return Company by ID") })
	@GetMapping(value = "/company/{id}", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Company> companyById(@PathVariable Long id) {
		Optional<Company> optCompany = this.repo.findById(id);
		if (optCompany.isPresent())
			return ResponseEntity.ok(optCompany.get());
		else
			return ResponseEntity.ok(new Company());
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Update Company") })
	@PutMapping(value = "/company/{id}", produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Company> updateCompany(@RequestBody Company company) {
		return ResponseEntity.ok(this.repo.save(company));
	}

}
