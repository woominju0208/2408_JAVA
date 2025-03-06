package oop.enumeration;

public class ExEnum {
    public static void main(String[] args) {
        Days day = Days.TUESDAY;
        System.out.println(day);
        System.out.println(day.getDayName());
        System.out.println(day.getDayNum());
    }
}

// enum 은 상수
enum Days {
//    public static final SUNDAY = new Days("일요일");
//    public static final SUNDAY = new Days("월요일");
    SUNDAY("일요일", 0)
    ,MONDAY("월요일", 1)
    ,TUESDAY("화요일", 2)
    ,WEDNESDAY("수요일", 3)
    ,THURSDAY("목요일", 4)
    ,FRIDAY("금요일", 5)
    ,SATURDAY("토요일", 6);

    // 상수 문자열 저장 프로퍼티
    private final String dayName;
    private final int dayNum;


    // 싱글톤 생성자(파라미터를 enum 과 같이 받기)
    private Days(String dayName, int dayNum) {
        this.dayName = dayName;
        this.dayNum = dayNum;

    }

    // Getter
    public String getDayName() {
        return this.dayName;
    }
    public int getDayNum() {
        return this.dayNum;
    }

}