package com.lzh.string;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2019-11-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L22GenerateParentheses {
    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * For example, given n = 3, a solution set is:
     * <p>
     *     回溯法
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        int aNum = n;//左边括号数量
        int bNum = n;//右边括号数量

        List<String> res = new ArrayList();
        //每次先放左边括号
        deepGen(n, aNum - 1, bNum, "(", res);
        return res;
    }

    public static void deepGen(int len, int aNum, int bNum, String data, List<String> res) {
        if (aNum == 0 && bNum == 0) {
            res.add(data);
            System.out.println(data);
            return;
        }
        if (aNum > 0) {

            deepGen(len, aNum - 1, bNum, data + "(", res);
        }
        if (bNum > aNum) {// abba 这种场景需要考虑
            deepGen(len, aNum, bNum - 1, data + ")", res);
        }

    }



    public static void main(String[] args) {
        generateParenthesis(1);
        generateParenthesis(2);
        generateParenthesis(3);
    }
}
