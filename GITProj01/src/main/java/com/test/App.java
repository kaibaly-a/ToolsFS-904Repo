package com.test;

import com.nt.service.arithmatic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        arithmatic ar=new arithmatic();
        long result=ar.sum(10,20);
        long subresult=ar.sub(10, 20);
        System.out.println(result);
        System.out.println(subresult);
    }
}
