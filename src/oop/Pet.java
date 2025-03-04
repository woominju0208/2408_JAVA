package oop;

import oop.pet.Whale;

public class Pet {
    public static void main(String[] args) {
//        인스턴스 화 시 앞에 데이터타입 이름은 클래스명이 된다.
        Whale whale = new Whale();
        Whale whale2 = new Whale(20);
        Whale whale3 = new Whale(30, "mandu");

        whale.swimming();

        int sum = whale.mySum(1, 2);
        System.out.println(sum);

        long long1 = 1;
        long long2 = 2;
//         mySum(int a, int b)은 int로 값을 받아야 하기 때문에 오류
//        그래서 오버로딩으로 int, long 둘다 선언함
        long sum2 = whale.mySum(long1, long2);


    }
}
