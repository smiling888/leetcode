package com.lzh.string;

import java.util.*;

/******************************************************
 * @Date: 2021-02-10
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L17letterCombinations {
    Map<String, List<String>> map = new HashMap() {{
        put("2", Arrays.asList("a", "b", "c"));
        put("3", Arrays.asList("d", "e", "f"));
        put("4", Arrays.asList("g", "h", "i"));
        put("5", Arrays.asList("j", "k", "l"));
        put("6", Arrays.asList("m", "n", "o"));
        put("7", Arrays.asList("p", "q", "r", "s"));
        put("8", Arrays.asList("t", "u", "v"));
        put("9", Arrays.asList("w","x", "y", "z"));

    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String digit = digits.substring(i, i + 1);
            List<String> data = map.get(digit);
            if (result.size() == 0) {
                result.addAll(data);
            } else {
                List<String> tmpResult = new ArrayList<>();
                for (String a : result) {
                    for (String b : data) {
                        tmpResult.add(a + b);
                    }
                }
                result = tmpResult;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Math.round(-1.5));
        System.out.println(new L17letterCombinations().letterCombinations("23"));
        ;
    }
}
