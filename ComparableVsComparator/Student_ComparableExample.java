package com.timothy.ComparableVsComparator;

public class Student_ComparableExample implements Comparable<Student_ComparableExample>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Student_ComparableExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student_ComparableExample o) {
        if(this.id<o.id)
            return -1;
        if(this.id>o.id)
            return 1;
        return 0;
    }
}
