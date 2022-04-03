package com.saline.naton.service.impl;

import com.saline.naton.dto.CompanyDTO;
import com.saline.naton.exception.CompanyNotFoundException;
import com.saline.naton.mapper.Mapper;
import com.saline.naton.repository.CompanyRepository;
import com.saline.naton.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    private Mapper mapper;

    @Override
    public Iterable<CompanyDTO> findAll() {
        return companyRepository.findAll().stream().map(a -> mapper.toDto(a)).collect(Collectors.toList());
    }

    @Override
    public CompanyDTO findById(Long id) {
        return mapper.toDto(companyRepository.findById(id).orElseThrow(CompanyNotFoundException::new));
    }

    @Override
    public CompanyDTO save(CompanyDTO companyDTO) {
        return mapper.toDto(companyRepository.save(mapper.toCompany(companyDTO)));
    }
}
