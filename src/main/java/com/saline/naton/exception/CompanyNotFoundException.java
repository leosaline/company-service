package com.saline.naton.exception;

import com.saline.naton.entity.Company;

import java.util.function.Supplier;

public class CompanyNotFoundException extends RuntimeException implements Supplier<Company> {

    public CompanyNotFoundException() {
        super("Could not find company");
    }

    @Override
    public Company get() {
        return null;
    }
}
