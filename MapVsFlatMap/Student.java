package com.timothy.MapVsFlatMap;

import java.util.List;

public class Student {
    private final int rollNo;
    private final String name;
    private final List<String> parentsName;

    public Student(int rollNo, String name, List<String> parentsName) {
        this.rollNo = rollNo;
        this.name = name;
        this.parentsName = parentsName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public List<String> getParentsName() {
        return parentsName;
    }
}
