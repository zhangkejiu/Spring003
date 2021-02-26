package com.chen.test;

/**
 * @ClassName Stest
 * @Description TODO
 * @Author cyh
 * @Date 2021/2/26 17:49
 */
public class Stest {

    public static void main(String[] args) {

        String s1=new String("zs");
        String s2=new String("zs");
        System.out.println(s1 == s2);

        String s3="zs";
        String s4 = "zs";

        System.out.println(s3 == s4);
        System.out.println(s3 == s1);

        String s5="zszs";
        String s6=s3+s4; //new String (s3+s4)
        System.out.println(s5 == s6);

        final String s7 = "zs";
        final String s8 = "zs";
        System.out.println(s8==s7);

        String s9 = s7 + s8; //s7,s8在常量池里
        System.out.println(s5 == s9);

        final  String s10=s3+s4;
        System.out.println(s5==s10);


            }
}