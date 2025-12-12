package C01Basic;

import java.util.*;

public class C11Map {
    public static void main(String[] args) {
//        map : key, value 로 이루어진 자료구조
//        Map<String, Integer> sports =new HashMap<>();
////        특징 : 키는 중복이 없음 . value는 중복이 가능.
//        sports.put("농구",2);
//        sports.put("축구",3);
//        sports.put("배구",2);
//        sports.put("농구",3); //중복이 없으므로 덮어쓰기
//
////        특징 : map key 에는 순서가 없음(index 활용 X)
////        System.out.println(sports);
////
//////        득징 : map에서 key값을 통한 검색 복잡도는 0(1)
////        System.out.println(sports.get("농구"));
//
////        map의 전체 value 데이터 출력
////        map의 key값 접근시에는 index 사용 불가능(순서가 없음)
////        ketset() : map의 전체 key목록을 반환하는 메서드
//
//        for(String a : sports.keySet()){
//            System.out.println("key :" + a+"value"+sports.get(a));
//        }
//
////        values() : map 의 전체 value 목록을 반환하는 메서드(잘 안쓰임)
//        for(int a : sports.values()){
//            System.out.println(a);
//        }

//        Map<String,Integer> sports = new HashMap<>();
//        sports.put("축구",2);
//        sports.put("농구",3);
//        sports.put("배구",2);
//
//
////        remove : key를 통해 map 요소 삭제
//        sports.remove("축구");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("배구",10);
//        System.out.println(sports);
//
//
////        containskey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("배구"));
//        System.out.println(sports.containsKey("탁구"));

//        map을 통한 개수 count
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"}; //농구 :2 야구:1 축구:2
//        Map<String, Integer> myMap = new HashMap<>();
//        for (String a : arr) {
////            if (myMap.containsKey(a)) {
////                myMap.put(a, myMap.get(a) + 1);
////            } else {
////                myMap.put(a, 1);
////            }
////          getOrDefault(키값,초기값) : key 값이 있으면 있는 값 리턴, 없을경우 초기값 리턴
//            myMap.put(a,myMap.getOrDefault(a,0)+1);
//        }
//            System.out.println(myMap);

//        map의 value값 감소 로직
//        String[] arr2 = {"농구","농구","농구","야구","축구"};
////        축구 1만 남도록
//        Map<String, Integer>myMap = new HashMap<>();
//        for(String a : arr2){
//            if(myMap.containsKey(a)){
//                if(myMap.get(a)==1){
//                    myMap.remove(a);
//                }else{
//                    myMap.put(a,myMap.get(a)-1);
//                }
//            }
//
//        System.out.println(myMap);

//        프로그래머스 : 완주하지 못한 선수
//        참가자를 모두 map에 담기, 완주한사람을 map에서 뺴기, 남은사람 출력
//        String[] participant={"mislav", "stanko", "mislav", "ana"};
//        String[] completion={"stanko", "ana", "mislav"};
//        Map<String, Integer> myMap= new HashMap<>();
//        String answer = "";
////        참가자를 모두 담는다.
//        for(String a : participant ){
//            myMap.put(a,myMap.getOrDefault(a,0)+1);
//        }
//
////        완주자를 참가자에서 뺸다.
//        for(String b : completion){
//
//            if(myMap.containsKey(b)){
//                if(myMap.get(b)==1){
//                    myMap.remove(b);
//                }
//                else {
//                    myMap.put(b,myMap.get(b)-1);
//                }
//
//            }
//
//        }for(String c : myMap.keySet()){
//            answer = c;
//        }
//        return answer;

//        프로그래머스 : 의상

//    가장 value 가 큰 key값 찾기
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//        for(String a : myMap.keySet()){
//            int value = myMap.get(a);
//            if(max<value){
//                max = value;
//                maxKey = a;
//            }
//        }
//        System.out.println(maxKey);

//        백준 - 베스트셀러

//        맥스 value를 구한다(for문)

//        해당 맥스value를 갖는 key를 구한다. 모두 list에 더한다 (for문)

//        list를 정렬한다.0번째값 출력

//      백준-집합과 맵,해시를 사용한 집합과 맵


//        TreeMap : key를 정렬(오름차순)하여 map을 저장
        Map<String, Integer> myMap = new TreeMap<>();
//        Map<String, Integer> myMap = new TreeMap<>(Comparator.reverseOrder()); //내림차순
        myMap.put("hello5",1);
        myMap.put("hello4",2);
        myMap.put("hello3",3);
        myMap.put("hello2",4);
        myMap.put("hello1",5);
        System.out.println(myMap);

//        백준 : 파일 정리

    }
}



