package com.timothy.CollectorsGroupingBy;

import java.util.Objects;

public class Student {
    private int Age;
    private String Name;
    private String CompanyName;

    public int getAge() {
        return Age;
    }

    public Student(int age, String name, String companyName) {
        Age = age;
        Name = name;
        CompanyName = companyName;
    }

    public String getName() {
        return Name;
    }

    public String CompanyName() {
        return CompanyName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                ", CompanyName=" + CompanyName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Name != null ? Name.hashCode() : 0;
    }
}
