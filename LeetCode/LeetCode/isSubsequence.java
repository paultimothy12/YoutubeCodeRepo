package com.timothy.LeetCode;

public class isSubsequence {
    //problem 392

        public static boolean isSubsequence(String subStr, String str) {
            int subStrIndex = 0;
            int strIndex = 0;
            while (subStrIndex < subStr.length() && strIndex < str.length()) {
                if (subStr.charAt(subStrIndex) == str.charAt(strIndex)) {
                    subStrIndex++;
                }
                strIndex++;
            }
            return subStrIndex == subStr.length();
        }

        public static void main(String[] args) {
            String subStr = "abc";
            String str = "abcdabc";
            System.out.println(isSubsequence(subStr, str));
        }


}
