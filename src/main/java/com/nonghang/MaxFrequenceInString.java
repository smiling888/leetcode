package com.nonghang;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequenceInString {
    public static void main(String[] args) {
        System.out.println(frequenceChar("aabbdddddffaaaa"));
    }

    public static String frequenceChar(String args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxFreq = 0;
        String subString = "";
        for (Character tmp : args.toCharArray()) {
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, +1);
            }
            if (map.get(tmp) > maxFreq) {
                subString = tmp.toString();
            }

        }
        return subString;
    }
}
