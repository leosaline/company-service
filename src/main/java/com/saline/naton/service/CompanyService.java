package com.saline.naton.service;

import com.saline.naton.dto.CompanyDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CompanyService {
    Iterable<CompanyDTO> findAll();

    Optional<CompanyDTO> findById(Long id);

    CompanyDTO save(CompanyDTO companyDTO);
}
