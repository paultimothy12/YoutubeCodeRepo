package com.timothy.StreamDemo;

import java.util.List;
import java.util.Objects;

public class Student {
    private final int rollNo;
    private final String name;
    private final List<String> parentsName;

    public Student(int rollNo, String name, List<String> parentsName) {
        this.rollNo = rollNo;
        this.name = name;
        this.parentsName = parentsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", parentsName=" + parentsName +
                '}';
    }

    public List<String> getParentsName() {
        return parentsName;
    }


}
