package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        //개체 생성
        Calculator calc=new Calculator();

        //메소드 호출
        calc.checkMethod();

        //1부터 10까지의 합
        System.out.println("1부터 10까지의 합: " + calc.sum1to10());

        //제일 큰수와 합
        int a = 10;
        int b = 20;

        //1. 제일 큰수
        calc.checkMaxNumber(a,b);

        //2. 합
        int sum=calc.sumTwoNumber(10,20);
        System.out.println("sum = " + sum);

        //차
        int a1=10;
        int b1=5;
        int sub=calc.minusTwoNumber(10,5);
        System.out.println("sub = " + sub);







    }
}
