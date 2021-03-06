package com.lzh.string;

import java.util.HashMap;
import java.util.Map;

/******************************************************
 * @Date: 2021-02-26
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1405longestDiverseString {

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', a);
        map.put('b', b);
        map.put('c', c);
        Character lastMax = null;

        while (true) {
            boolean next = false;
            int maxSize = 0;
            Map.Entry<Character, Integer> curMax = null;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (!entry.getKey().equals(lastMax) && entry.getValue() > maxSize) {
                    next = true;
                    curMax = entry;
                    maxSize = entry.getValue();
                }

            }

            if (!next) {
                break;
            }
            if (curMax.getValue() > 1) {
                stringBuilder.append(curMax.getKey()).append(curMax.getKey());
            } else {
                stringBuilder.append(curMax.getKey());
            }
            curMax.setValue(curMax.getValue() - 2);
            lastMax = curMax.getKey();
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new L1405longestDiverseString().longestDiverseString(7, 1, 0);
    }
}
