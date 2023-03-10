package com.timothy.RestAPI.RestAPI;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
public class JobEntryJpaResource {

    private final JobEntryRepository jobEntryRepository;

    public JobEntryJpaResource(JobEntryRepository jobEntryRepository) {
        this.jobEntryRepository = jobEntryRepository;
    }

    @GetMapping("/")
    public String startPage(){
        return "Success";
    }

    @GetMapping("jobs/view/all")
    public List<JobEntry> retrieveAll() {
        return jobEntryRepository.findAll();
    }
    @GetMapping("jobs/{companyName}/all")
    public List<JobEntry> retrieveSpecificCompanyJobs(@PathVariable String companyName) {
        return jobEntryRepository.findByCompanyName(companyName);
    }

    @GetMapping("jobs/view/{id}")
    public JobEntry retrieveJob(@PathVariable int id) {
        return jobEntryRepository.findById(id).get();
    }

    @DeleteMapping("jobs/delete/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable int id) {
        jobEntryRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("jobs/update/{id}")
    public JobEntry updateJob(@PathVariable int id, @RequestBody JobEntry jobEntry) {
        jobEntryRepository.save(jobEntry);
        return jobEntry;
    }

    @PostMapping("jobs/create/new")
    public void createNewJob(@RequestBody JobEntry jobEntry) {
        int newId = jobEntry.getId();
        if(jobEntryRepository.findAll().stream().anyMatch(jobEntry1 -> jobEntry1.getId()==newId)){
            log.info("<============Job Id is already Present - Entry Omitted!!!============>");
            log.info("Existing Job IDs ->"+jobEntryRepository.findAll().stream().map(JobEntry::getId).toList().toString());
            return;
        }
        jobEntryRepository.save(jobEntry);
    }

}

