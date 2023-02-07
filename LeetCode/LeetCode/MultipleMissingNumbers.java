package com.timothy.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleMissingNumbers {
    static void MissingElements(int[] arr){
        List<Integer> integerList = Arrays.stream(arr)
                .boxed().sorted().collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println("Missing Elements are:");

        for(int i=0;i<maxElement(arr);i++){
            if(!integerList.contains(i)){
                System.out.println(i);
            }
        }
    }
    static int maxElement(int[] arr){
        return Arrays.stream(arr).boxed().max(Integer::compareTo).get();
    }
    public static void main(String[] args) {
        int[] n1 = {4, 2, 5, 2, 3, 0, 7,8,10,3};
        MissingElements(n1);
    }
}
