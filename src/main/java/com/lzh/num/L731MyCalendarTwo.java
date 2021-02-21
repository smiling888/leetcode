package com.lzh.num;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L731MyCalendarTwo {
    List<int[]> bookList = new ArrayList<>();

    List<int[]> rangeList = new ArrayList<>();

    public L731MyCalendarTwo() {

    }
    //[[],[10,20],[50,60],[10,40],[5,15],[5,10],[25,55]]

    /**
     * 获取查询区间
     * 计算重叠区间
     *
     * @param start
     * @param end
     * @return
     */
    public boolean book2(int start, int end) {
        for (int[] data : rangeList) {
            if (end <= data[0] || start >= data[1]) {
                continue;
            }
            return false;
        }
        for (int[] data : bookList) {
            if (end <= data[0] || start >= data[1]) {
                continue;
            }
            rangeList.add(new int[]{Math.max(start, data[0]), Math.min(end, data[1])});
        }
        bookList.add(new int[]{start, end});
        return true;
    }
    TreeMap<Integer, Integer> delta = new TreeMap();

    public boolean book(int start, int end) {
        delta.put(start, delta.getOrDefault(start, 0) + 1);
        delta.put(end, delta.getOrDefault(end, 0) - 1);

        int active = 0;
        for (int d: delta.values()) {
            active += d;
            if (active >= 3) {
                delta.put(start, delta.get(start) - 1);
                delta.put(end, delta.get(end) + 1);
                if (delta.get(start) == 0)
                    delta.remove(start);
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        L731MyCalendarTwo MyCalendar = new L731MyCalendarTwo();
        MyCalendar.book(10, 20); // returns true
        MyCalendar.book(50, 60); // returns true
        MyCalendar.book(10, 40); // returns true
        MyCalendar.book(5, 15); // returns false
        MyCalendar.book(5, 10); // returns true
        MyCalendar.book(25, 55); // returns true

        int[] db = new int[]{10, 20};
        int[] b = new int[]{5, 25};
        System.out.println(b[1] <= db[0] || b[0] >= db[1]);
    }
}
