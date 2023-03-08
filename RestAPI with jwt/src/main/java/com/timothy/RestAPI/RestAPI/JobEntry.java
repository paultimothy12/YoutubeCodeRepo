package com.timothy.RestAPI.RestAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class JobEntry {
    public JobEntry() {
    }
    public JobEntry(Integer id, String companyName, String jobTitle,Integer salary, String email, LocalDate deadLine){
        this.id= id;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.email = email;
        this.deadLine = deadLine;
    }

    @Id
    private Integer id;
    private String companyName;
    private String jobTitle;
    private Integer salary;
    private String email;
    private LocalDate deadLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        return "JobEntry{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", deadLine=" + deadLine +
                '}';
    }
}
