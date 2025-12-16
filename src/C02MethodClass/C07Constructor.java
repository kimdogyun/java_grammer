package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성
        Calender c1 =new Calender("2025","12","16");

//        캘린더 객체 출력
        System.out.println(c1);

//        java자료구조내에 직접 만든 객체를 담아 관리
        List<Calender> myList=new ArrayList<>();
        myList.add(c1);
        myList.add(new Calender("2024","01","12"));
        System.out.println(myList);
    }
}

//클래스명 : Calender , 변수 : year, month, day , 모두 String
   class Calender{
    private String year;
    private String month;
    private String day;

//    생성자 : 객체가 만들어지는(new) 시점에 호출되는 메서드
//    생성자특징
//    1)클래스명과 메서드명이 동일
//    2)반환타입이없음
//    3)매개변수가 있을수도 있고 없을 수도
//    생성자의 사용목적
//    1)객체 생성시점에 객체변수값들을 초기화(세팅)
//    2)변수의 안정성을 위해 setter 사용을 지양하고,생성자를 사용
    public Calender(String year, String month, String day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
//    직접 생성자를 1개라도 추가할경우,초기(기본)생성자는 무시가 되므로, 필요시 별도로 추가
    public Calender(){

    }


    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
//     toString()메서드는 객체명으로 출력시 자동으로 메서드가 호출
    @Override
    public String toString() {
        return "{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    public String calenderInfo(){
        return " 연도는 "+this.year+" 월은 "+this.month+" 일은 "+this.day;
    }
}
