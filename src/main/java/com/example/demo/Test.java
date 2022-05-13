package com.example.demo;

import java.math.BigDecimal;

public class Test {
    public static void main(String[]args){
        System.out.println(new BigDecimal("1.1").compareTo(new BigDecimal(1.1)));
//        BigInteger a=new BigInteger("13",10);
//        BigInteger b=new BigInteger("70",10);
////        System.out.println(a.max(b));
////        System.out.println(a.add(b));
////        System.out.println(a.subtract(b));
////        System.out.println(a.divide(b));
////        System.out.println(b.divide(a));
////        System.out.println(b.multiply(a));
//        Arrays.stream(b.divideAndRemainder(a)).forEach((it)->{System.out.println(it);});
    }

}
