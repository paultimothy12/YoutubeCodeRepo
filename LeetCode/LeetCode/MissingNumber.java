package com.timothy.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    //268 https://leetcode.com/problems/missing-number/

    static int sumSubtraction(int[] arr){
        int arrSum=0;

        for( int i : arr){
            arrSum=arrSum+i;
        }

        int totalSum= (arr.length*(arr.length+1))/2;
        return totalSum-arrSum;
    }



    // using Collections
    static int StreamMissingElements(int[] arr){
        List<Integer> integerList = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
        System.out.println(integerList);
        int result = 0;
        for (int i =0; i< arr.length;i++){
            if(i!=integerList.get(i)) {
                result = i;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] n1 = {4, 2, 5, 1, 6, 0, 7};
        int[] n2 ={0,1};
        //sumSubtraction - all testcase passed
        System.out.println(sumSubtraction(n2));

        //using collections n2 fails in leetcode
        System.out.println(StreamMissingElements(n1));
        System.out.println(StreamMissingElements(n2));


    }
}
