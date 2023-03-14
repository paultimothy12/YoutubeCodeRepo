package com.timothy.testDatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class TestData {
    public TestData() {
    }
    @Id
    Integer serialNumber;
    String content;
    public TestData(Integer serialNumber, String content) {
        this.serialNumber = serialNumber;
        this.content = content;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "serialNumber=" + serialNumber +
                ", content='" + content + '\'' +
                '}';
    }
}
