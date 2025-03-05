package oop.exextends;

public class ExConstruct {
    public static void main(String[] args) {
        Whale2 whale2 = new Whale2();
        whale2.print(); // whale w 대소문자 주의 Whale2를 적으면 인스턴스화 하지않은 메소드를 가져오는거임
    }
}

class Animal {
//    public Animal() {}
    public Animal(int a) {
        System.out.println("Animal");
    }
}

// 같은 패키지내에 같은 클래스이름은 쓸수없음
class Mammal2 extends Animal {
    protected String name = "Mammal";

    public Mammal2() {
//        super(); 가 생략되어 있다. super는 부모의 default생성자를 가져오기 때문에
        super(1);
        System.out.println("Mammal2");
    }
}
class Whale2 extends Mammal2 {
    protected String name = "Whale2";

    public Whale2() {
//        super(); 가 생략되어 있다.
        System.out.println("Whale2");
    }

    public void print() {
        String name = "print";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}