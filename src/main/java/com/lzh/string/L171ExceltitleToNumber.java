package com.lzh.string;

/******************************************************
 * @Date: 2021-02-17
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L171ExceltitleToNumber {

    public static int titleToNumber(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {

            int data = ((s.charAt(i) - 'A' + 1) * (int) Math.pow(26, (s.length() - i - 1)));
            total = total + data;
        }
        return total;
    }

    /**
     * x=x*26+data
     * @param s
     * @return
     */
    public static int titleToNumber2(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int data = s.charAt(i) - 'A' + 1;
            total = total * 26 + data;
        }
        return total;
    }


    public static void main(String[] args) {
        String s = "AB";
        int total = 10;
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(s.charAt(1) - 'z');
    }
}
