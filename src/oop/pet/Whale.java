package oop.pet;

public class Whale {
//    int age;    // 같은 패키지에 소속된 클래스에서 접근가능
    public static  String back; // 클래스 변수
    private int age; // 인스턴스 변수
    private String name; // 인스턴스 변수

//    생성자(construct) : 클래스를 인스턴스화할 때, 딱 한번 실행되는 메소드
//    객체의 초기화 또는 딱한번 처음 실행되어야 할때 사용

//    생성자도 메소드로 오버로딩이 되기 때문에 int age 말고도 다른 파라미터들을 받는 정의를 할수있다.
    public Whale() {
        this(10);
    }
    public Whale(int age) {
        this(age, "John");
    }
    public Whale(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    -----------메소드-----------------------------------
//    자바는 메소드 형태를 지정해줘야 함 ,리턴할 데이터타입이 없을시엔 void
    public void swimming() {
        String test = "test";   // 메소드안에서만 있는 변수는 지역변수
        System.out.println("Swimming");
    }

//    오버로딩(overloading): php와 다르게 메소드명을 중복해도 파라미터에 데이터타입을 다르게 적으면 메소드명을 중복할수있다.
//    그럼 println은 어떤 데이터타입이 와도 출력되는건 모든 타입이 오버로딩 되어 있단 거다.
    public int mySum(int a) {
        return a + 1;
    }
    public int mySum(int a, int b) {
        return a + b;
    }
    public long mySum(long a, long b) {
        return  a + b;
    }

}
