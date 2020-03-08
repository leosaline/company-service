package com.saline.naton;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return list of company") })
	@RequestMapping(value = "/companys", method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin(origins = "http://localhost:8080")
	@ResponseBody
	public ResponseEntity<Collection<Company>> listProducts() {
		return ResponseEntity.ok((Collection<Company>) this.repo.findAll());
	}

}
