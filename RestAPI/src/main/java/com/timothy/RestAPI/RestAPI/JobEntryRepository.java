package com.timothy.RestAPI.RestAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JobEntryRepository extends JpaRepository<JobEntry, Integer> {
    List<JobEntry> findByCompanyName(String companyName);
}
