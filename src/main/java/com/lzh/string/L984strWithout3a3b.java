package com.lzh.string;

/******************************************************
 * @Date: 2021-03-15
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L984strWithout3a3b {
    /**
     * 给定两个整数 A 和 B，返回任意字符串 S，要求满足：
     *
     * S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
     * 子串 'aaa' 没有出现在 S 中；
     * 子串 'bbb' 没有出现在 S 中。
     *
     *
     * @param a
     * @param b
     * @return
     */
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        int aCount=0,bCount=0;
        while(a>0||b>0){
            if((a>b&&aCount<2)||bCount>=2){
                sb.append("a");
                a--;
                aCount++;
                bCount=0;
            }else{
                sb.append("b");
                b--;
                bCount++;
                aCount=0;
            }
        }
        return sb.toString();

    }
}
