package com.sda.company.service;


import com.sda.company.dto.CompanyCreateDto;
import com.sda.company.dto.CompanyInfoDto;
import com.sda.company.dto.CompanyShortInfoDto;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    CompanyInfoDto createCompany(CompanyCreateDto companyCreateDto);

    List<CompanyShortInfoDto> getAllCompanies();

    Optional<CompanyInfoDto> findCompanyByName(String name);
}
