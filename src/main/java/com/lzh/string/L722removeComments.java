package com.lzh.string;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-03-20
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L722removeComments {
    //需要考虑各种场景
    // /*/*/
    // /**//*/
    // //
    //

    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        boolean inBlock = true;
        for (String str : source) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (inBlock&&chars[i] == '/' && i + 1 < str.length() && chars[i + 1] == '*') {
                    //考虑 /*/的情况
                    i++;
                    inBlock = false;
                } else if (!inBlock && chars[i] == '*' && i + 1 < str.length() && chars[i - 1] == '/') {
                    // 需要+1 否则
                    i++;
                    inBlock = true;
                } else if (inBlock && chars[i] == '/' && i + 1 < str.length() && chars[i + 1] == '/') {
                    //考虑 /* // */
                    break;
                } else {
                    if (inBlock) {
                        line.append(chars[i]);
                    }
                }

            }

            if (inBlock && line.length() > 0) {
                res.add(line.toString());
                line = new StringBuilder();
            }
        }
        return res;


    }

    public static void main(String[] args) {
        new L722removeComments().removeComments(new String[]{"/*Test program */", "int main () ", " {", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"});
    }
}
