package com.saline.naton.service;

import com.saline.naton.dto.CompanyDTO;

public interface CompanyService {
    Iterable<CompanyDTO> findAll();

    CompanyDTO findById(Long id);

    CompanyDTO save(CompanyDTO companyDTO);
}
