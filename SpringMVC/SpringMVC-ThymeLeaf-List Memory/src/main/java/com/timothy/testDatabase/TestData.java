package com.timothy.testDatabase;

import lombok.Data;

@Data
public class TestData {
    Integer serialNumber;
    String content;

    public TestData(Integer serialNumber, String content) {
        this.serialNumber = serialNumber;
        this.content = content;
    }
}
