package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int [] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방법 : 메모리주소접근
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
////        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력(연산작업포함)만 존재하는 코딩스타일
////        streamApi : java에서 함수형프로그래밍을 지원하는 라이브러리
////        forEach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));

//        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        Stream<String>stream1=myList.stream();
//        String[] myArr = {"java", "python", "C++"};
//        Stream<String> stream2 = Arrays.stream(myArr);
//
////        원시자료형을 위한 stream객체가 별도로 존재
//        int [] intarr = {10,20,30,40,50};
//        IntStream stream3=Arrays.stream(intarr);

//        stream의 중개연산(변환) : filter, map, sorted, distinct, mapToInt
//        int [] intArr = {10,10,30,40,50};
////        fitler : 특정기준으로 대상을 필터일하여 새로운 스트림을 반환하는 중개연산
////        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
//        int total = Arrays.stream(intArr).filter(a->a>=30).sum();
//        System.out.println(total);
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int total2 = Arrays.stream(intArr).map(a->a*a).sum();
//        System.out.println(total2);
////        distinct : 중복제거
//        int total3 = Arrays.stream(intArr).distinct().sum();
//        System.out.println(total3);
////        sorted : 정렬
//        int [] sortedArr = Arrays.stream(intArr).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArr));
////        mapToInt : intStream형태로 변환해주는 map
//        String [] stArr = {"java","python","C++"};
//        int totalLength = Arrays.stream(stArr).mapToInt(a->a.length()) .sum();
//
//        int [] arr = {1,2,3,4,5,6};
////        실습 1) arr에서 홀수만 담은 배열을 생성 후 배열 출력
//       int[] arr1= Arrays.stream(arr).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(arr1));
////        실습 2) arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 출력
//        int []arr2 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).toArray();
////        int [] arr2 = Arrays.stream(arr1).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(arr2));
////        실습 3) arr에서 홀수만 걸러 제곱값을 구하고, 해당숫자값을 오름차순한 순서로 배열을 출력
//        int []arr3 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).sorted().toArray();
////        int[]arr3=Arrays.stream(arr2).sorted().toArray();
//        System.out.println(Arrays.toString(arr3));


//        stream의 소모 : forEach(출력), sum(합계), count, max, min, reduce(누적연산), findFirst(스트림의 첫번쨰값 리턴)
//        int [] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//        long count = Arrays.stream(intArr).count();
//        System.out.println(count);
////        optional객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();

//        reduce : 누적연상 -> reduce(초기값, 연산식)
//        int [] intArr = {10,20,30,40};
//        int accSum = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(accSum);
//        int accMultiply = Arrays.stream(intArr).reduce(1,(a,b)->a*b);
//        System.out.println(accMultiply);
//        String[]stArr = {"java","python","C++"};
//        String result = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(result);
////        findFirst : 첫번쨰요소 반환
//        String firstvalue = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(firstvalue);
//        Map<String,Integer>myMap = new TreeMap<>();
//        myMap.put("hello",10);
//        myMap.put("java",20);
//        String firstValue=myMap.keySet().stream().findFirst().get();
//        System.out.println(firstValue);

//        배열로 변환시 주의사항 : 제니릭의 타입소거 -> 자바의 런타임시점에 <String>과 같은 제네릭의 타입이 제거되는 현상
//        제네릭의 타입소거로 인해, toArray를 통해 새로운 String 배열을 곧바로 만들어내는 것은 불가
         String [] stArr = {"hello", "java", "world"};
         String [] answer = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(a->new String[a]); //a안에는 배열의 길이가 담김

//        메소드 창조 : 하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식
//        형식-"클래스명"::"메서드명",조건-하나의 메서드만을 호출하는 경우
        Arrays.stream(stArr).forEach(a-> System.out.println(a));
        Arrays.stream(stArr).forEach( System.out::println);

        String [] answer2 = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(String[]::new);

//        streamapi 실습)
//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("kim",20));
//        myList.add(new Student("choi",30));
//        myList.add(new Student("lee",35));
//        myList.add(new Student("park",22));
//
////        1)모든 객체의 평균나이 (average함수)
//        double averageAge=myList.stream().mapToInt(a-> a.getAge()).average().getAsDouble();
//
////        2)정렬을 통한 갖아 나이 어린 사람 찾기(sorted+findFirst)
        // 방법 1)
//        Student s1 = myList.stream().min(Comparator.comparingInt(Student::getAge)).get();
//        방법 2)
//        Student s1 = myList.stream().sorted((o1, o2) -> o1.getAge()-o2.getAge()).findFirst().get();
//
////        30대인 사람들의 이름만 모아서 새로운 String배열에 담기(map)활용
//       String[] arr = myList.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(a->new String[a]);

//        Optional객체 : 특정객체에 값이 없을지도(null) 모른다는 것을 명시적으로 표현란 객체
//        String st1 = null;
//        if(st1==null){
//            System.out.println("값이 없음");
//        }else{
//            System.out.println(st1.length());
//        }
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().length());
//        }else {
//            System.out.println("값이 없습니다");
//        }

//        Optinal객체 생성 방법 3가지.
//        Optional<String> opt1 = Optional.empty(); //비어있는 optional객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable(null); //비어있는 Optinal객체 생성
//        Optional<String> opt2_2 = Optional.ofNullable("hello"); //값이 있는 optional객체 생성
//        Optional<String> opt3 = Optional.of("hello"); //값이 있는 optional 객체 생성

//        Optional 객체 처리 방법 4가지.
//        방법1 isPresent()로 확인후에 get()
//        if(opt1.isPresent()){
//            System.out.println(opt1.get());
//        }else {
////            System.out.println(opt1.get());//에러발생
//            System.out.println("값이 없습니다");
//        }
////        방법2.orElse() :값이 있으면 있는 값 리턴 없으면 지정한 값 리턴
//        System.out.println(opt2_1.orElse("값이 없습니다"));
//        System.out.println(opt2_2.orElse("값이 없습니다"));
//
////        방법3.orelseGet() : 값이 있으면 있는 값 리턴 없으면 람다 함수 실행
//        System.out.println(opt2_2.orElseGet(()->new String("값이 없습니다.")));

//        방법4.orelsethrow() - 가장많이 쓰임, 값이 있으면 있는 값 리턴 , 없으면 지정한 예외(에러)강제발생
//        웹개발에서 값을 입력하는 사용자에게 적절한 메세지 전달 목적과 의도된 코드중단을 목표로 강제로 예외(에러)를 발생시키는 경우는 매우 일반적.
//        System.out.println( opt2_1.orElseThrow(()->new RuntimeException("값이 없습니다")));
//        System.out.println(opt2_1.get());//의도치않은 에러발생 (지양해야할에러)
//
//        Optional객체 처리 실습 1)
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("kim",20));
//        studentList.add(new Student("choi",30));
//        studentList.add(new Student("lee",35));
//        studentList.add(new Student("park",22));
//        optional객체 처리방법1.
//        OptionalDouble optionalAvg=studentList.stream().mapToInt(a->a.getAge()).average();
//        double value1 = 0;
//        if(optionalAvg.isPresent()){
//            value1= optionalAvg.getAsDouble();
//            System.out.println(value1);
//        }else{
//            System.out.println("값이 없습니다");
//        }
////        optional객체 처리방법2
//        double value2=studentList.stream().mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException());
//        System.out.println(value2);

//        optinal객체 처리실습 2)
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("kim",20));
        studentList.add(new Student("choi",30));
        studentList.add(new Student("lee",35));
        studentList.add(new Student("park",22));
        System.out.println("조회하고자 하는 student의 인덱스번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Optional<Student> s1;
        if(studentList.size()<=number || number <0){
            s1 = Optional.empty();
        }else{
            s1= Optional.of(studentList.get(number));
        }
        System.out.println(s1.orElseThrow(()->new NoSuchElementException("없는 회원")));
    }
}
