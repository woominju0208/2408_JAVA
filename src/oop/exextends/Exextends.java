package oop.exextends;

public class Exextends {
    public static void main(String[] args) {
        Whale whale = new Whale("고래", "바다");
        whale.breath();
    }
}

// final class Mammal 처럼 클래스에 final제어자가 붙으면 상속자체를 할수없다.
class Mammal {
    protected String name;
    protected String residence;
    protected final int age;    // Final 제어자 : 상속불가능

//    final 제어자는 상수기 때문에 초기화 해줘야 함
    public Mammal() {
        this.age = 0;
    }
// 메소드에도 final이 붙어도 싱속 불가능
    public void breath() {
        System.out.println(this.name + "가 폐호흡합니다.");
    }
}

class Whale extends Mammal {
    public Whale(String name, String residence) {
//        Mammal를 상속받았기 때문에 this로 name,residence를 가져올수 있음
        this.name = name;
        this.residence = residence;
    }

//    overriding할때 @Override를 적어줘야함
    @Override
    public void breath() {
        System.out.println("나는 나나나");
    }
}