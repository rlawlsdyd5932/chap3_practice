package com.greedy.level01.basic;

public class Calculator {


    public void checkMethod() {

        System.out.println("메소드 호출 확인");

    }

    public int sum1to10() {

        int sum=0;
        for (int i=1; i<=10; i++)
            sum+=i;
        return sum;
    }


    public void checkMaxNumber(int a, int b) {
        int result=(a>b)? a:b;
        System.out.println("두 수 중 제일큰수는 " + result + "이다.");

    }

    public int sumTwoNumber(int a, int b) {

        return(a+b);
    }

    public int minusTwoNumber(int a, int b) {

        return (a-b);
    }
}
