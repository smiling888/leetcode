package com.lzh.string;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1047removeDuplicates {
    /**
     * 注意 aaaa
     * 如果不用replaceFirst，可以考虑用栈，栈顶元素和将要入栈的值相同，则出战，最后栈中的元素即为
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        for (int i = 0; i < S.length(); i++) {
            int j = i + 1;
            //每次只删除相同的两个
            if (j < S.length() && S.charAt(i) == S.charAt(j)) {
                String sub = S.substring(i, j+1);
                S = S.replaceFirst(sub, "");
                //如果i=0，则保持在0最开始位置，如果在>0的位置就需要往前，因为for里面有+1 所谓需要i-2
                i = i == 0 ? i - 1 : i - 2;
            }

        }
        return S;
    }

    public static void main(String[] args) {
        new L1047removeDuplicates().removeDuplicates("aaaaaaaaa");
    }
}
