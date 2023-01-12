package com.repository;

import com.document.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CompanyRepository extends ElasticsearchRepository<Company, String> {

    Page<Company> findByEmployeesName(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match_phrase\": {\"employees.name\": \"?0\"}}]}}")
    Page<Company> findByEmployeesNameUsingCustomQuery(String name, Pageable pageable);

    SearchHits<Company> searchByDescription(String description);
}
