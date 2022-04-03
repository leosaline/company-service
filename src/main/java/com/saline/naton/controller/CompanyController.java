package com.saline.naton.controller;

import com.saline.naton.dto.CompanyDTO;
import com.saline.naton.service.CompanyService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ApiResponses(value = {@ApiResponse(code = 200, message = "Return list of companies")})
    @GetMapping(value = "/companies", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Iterable<CompanyDTO>> listCompanies() {
        return ResponseEntity.ok(this.companyService.findAll());
    }

    @ApiResponses(value = {@ApiResponse(code = 200, message = "Return Company by ID")})
    @GetMapping(value = "/company/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<CompanyDTO> companyById(@PathVariable Long id) {
        return ResponseEntity.ok(this.companyService.findById(id));
    }

    @ApiResponses(value = {@ApiResponse(code = 200, message = "Update Company")})
    @PutMapping(value = "/company/{id}", produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<CompanyDTO> updateCompany(@RequestBody CompanyDTO companyDTO) {
        return ResponseEntity.ok(this.companyService.save(companyDTO));
    }

}
