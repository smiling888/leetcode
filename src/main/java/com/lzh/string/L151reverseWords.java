package com.lzh.string;

/**
 * @author jiuxing.lzh
 * Date: 2021/5/8
 **/
public class L151reverseWords {

    public static void main(String[] args) {
        System.out.println(new L151reverseWords().reverseWords("the sky is blue"));
    }

    /**
     * https://leetcode-cn.com/problems/reverse-words-in-a-string/
     * 输入："the sky is blue"
     * 输出："blue is sky the"
     * 反转两次
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder stringBuilder=  trimSpaces(s);
        char[] chars = stringBuilder.toString().toCharArray();
        swap(chars, 0, chars.length - 1);

        int lastSapce = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                swap(chars, lastSapce, i - 1);
                lastSapce = i + 1;
            }
        }
        //最后一个不是空格的情况
        swap(chars, lastSapce, chars.length - 1);

        return String.valueOf(chars);
    }

    public void swap(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }

    public StringBuilder trimSpaces(String s) {
        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        // 将字符串间多余的空白字符去除
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);

            if (c != ' ') {
                sb.append(c);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }

            ++left;
        }
        return sb;
    }


}
