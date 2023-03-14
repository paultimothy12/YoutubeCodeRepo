package com.timothy.testDatabase;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Data
public class TestDatabase {
    public List<TestData> testDataList = new ArrayList<>
            (List.of(new TestData(1, "Content1"),
                    new TestData(2, "Content2")));

    public void addTestDataList(Integer serialNumber, String content) {
        testDataList.add(new TestData(serialNumber, content));
    }

    public void editTestDataList(Integer serialNumber, String content) {
        testDataList.remove(testDataList.get(serialNumber - 1));
        testDataList.add(new TestData(serialNumber, content));
    }

    public void deleteTestDataList(Integer serialNumber) {
        testDataList.remove(testDataList.get(serialNumber - 1));
    }
}
