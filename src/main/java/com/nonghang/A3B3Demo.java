package com.nonghang;

public class A3B3Demo {
    public static void main(String[] args) {
        System.out.println(toString("A3B2C1"));
    }

    public static String toString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            String tmp=str.substring(i,i+1);
            int num=Integer.parseInt(str.substring(i+1,i+2));
            for(int j=0;j<num;j++){
                builder.append(tmp);
            }
        }
        return builder.toString();
    }
}
