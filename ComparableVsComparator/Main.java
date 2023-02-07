package com.timothy.ComparableVsComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Sorting a collection of primitive and wrapper classes are inbuilt in Collections,
        // but what if we need to sort a custom class? then use
        // implement comparable interface - override compareTo() and provide the sorting logic inside the method
        // (or) define a comparator and override the compare() method inside the comparator and provide to sort method.

        //NORMAL SORT
        System.out.println("NORMAL SORT");
        List<Integer> num = new ArrayList<>();
        num.add(21);
        num.add(3);
        num.add(4);
        num.add(0);

        System.out.println("before sort "+num);
        Collections.sort(num);
        System.out.println("after sort "+num);
        //OUTPUT:
        //        before sort [21, 3, 4, 0]
        //        after sort [0, 3, 4, 21]

//        COMPARABLE
        System.out.println("COMPARABLE");
        List<Student_ComparableExample> studentList1= new ArrayList<>();
        studentList1.add(new Student_ComparableExample(11,"paul"));
        studentList1.add(new Student_ComparableExample(0,"timo"));
        studentList1.add(new Student_ComparableExample(19,"daniel"));

//      Collections.sort(studentList); - Doesn't work - Implement Comparable interface and then sort.
        System.out.println("before sort "+ studentList1);
        Collections.sort(studentList1);

        System.out.println("after sort "+studentList1);






//        COMPARATOR -  if the class couldn't implement comparable interface then we need to use Comparator\
        System.out.println("COMPARATOR");

        List<Student_ComparatorExample> studentList2= new ArrayList<>();
        studentList2.add(new Student_ComparatorExample(11,"paul"));
        studentList2.add(new Student_ComparatorExample(0,"timo"));
        studentList2.add(new Student_ComparatorExample(19,"daniel"));

        Comparator<Student_ComparatorExample> com= new Comparator<Student_ComparatorExample>() {
            @Override
            public int compare(Student_ComparatorExample o1, Student_ComparatorExample o2) {
                if(o1.getId()< o2.getId())
                    return -1;
                if(o1.getId()>o2.getId())
                    return 1;
                return 0;
            }
        };
        System.out.println("before sort "+studentList2);
        Collections.sort(studentList2, com);
        System.out.println("after sort "+studentList2);
    }
}
