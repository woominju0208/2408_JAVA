import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
////           변수
//        int age = 20;
//
//        age = 30;
//        char gender = 'M';
//        String name = "John";
//        boolean married = false;
//        float avgAge = 52.1f;
//        double avgAge2 = 52.1;
//
//        byte max = 127;
//        byte min = -128;
//
//        byte sum = (byte) (max + 1);
//        System.out.println(sum);
//
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a+b);
//
//        BigDecimal bd = new BigDecimal(Double.toString(a));
//        BigDecimal bd2 = new BigDecimal(Double.toString(b));
//        BigDecimal bsum = bd.add(bd2);
//        System.out.println(bsum);
//        String a = "Hello World";
//        String b = "Hello World";
//        System.out.println(a.equals(b));    // 스트링 비교

////        1~100 까지 숫자중 3과7의 배수 출력
//        for (int i = 1; i <= 100; i++) {
//            if(i%3 == 0 || i%7 == 0) {
//                System.out.println(i);
//            }
//        }

//        배열
//        int[] arrInt = new int[10]; // []안에는 배열의 길이
        int[] arrInt = {1, 2, 3, 4, 5};
        String[] arrString = {"a", "b", "c"};   // 배열 선언 시 {} 사용

//        arrInt[1] = 45; // arrInt[1] = "45"; 문자열을 넣으면 진작에 오류가 남

        int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length);
        // arrInt2 는 arrInt의 참조형이 되서 arrInt2[0] = 100;를 해도 arrInt[0] 값이 바뀐다.
        // 그래서 Arrays.copyOf(복사배열, 복사배열 길이)로 copy
        arrInt2[0] = 100;

        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrInt2));

    }
}