package com.lzh.num;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-02-20
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1352ProductOfNumbers {

    private List<Integer> result = new ArrayList<>(16);

    public L1352ProductOfNumbers() {
        result.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            result.clear();
            result.add(1);
        } else {
            result.add(result.get(result.size() - 1) * num);
        }

    }

    public int getProduct(int k) {
        if (k >= result.size()) {
            return 0;
        }
        return result.get(result.size()-1)/result.get(result.size()-k-1);
    }

    public static void main(String[] args) {
        L1352ProductOfNumbers productOfNumbers = new L1352ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));


    }
}
