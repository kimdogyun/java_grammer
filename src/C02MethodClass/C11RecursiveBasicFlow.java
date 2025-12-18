package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

//재귀함수 기본 호출 원리와 과정  재귀함수내 변화과정(매개변수로 넘기는 시점에 값 변경)
public class C11RecursiveBasicFlow {
    public static void main(String[] args) {
//        recur1(0, 3);
        recur2(new ArrayList<>(),0,3);

    }

    public static void recur0(int count, int taget) {
        if (count == taget) {
            return;
        }
        System.out.println("재귀 호출 전 count : " + count); //0(첫번쨰 호출)->1(두번쨰 호출)->2(세번째 호출)
        recur0(count + 1, taget);
        System.out.println("제귀 호출 후 count :" + count); //2(네번쨰)->1(다섯번째)->0(6번째)
    }
    //재귀함수 기본 호출 원리와 과정  재귀함수내 변화과정(함수내에서 값 변경)
    public static void recur1(int count, int taget) {
        if (count == taget) {
            return;
        }
        System.out.println("재귀 호출 전 count : " + count); //0(첫번쨰 호출)->1(두번쨰 호출)->2(세번째 호출)
        count += 1;
        recur1(count, taget);
        System.out.println("제귀 호출 후 count : " + count); //3(네번쨰)->2(다섯번째)->1(6번째)
    }
//객체를 매개변수로 활용한 재귀함수내 변화과정 : 객체는 힙메모리를 통해 원본객체가 변경되므로, 재귀함수간에도 값의 변화를 공류
    public static void recur2(List<Integer> myList, int count, int taget) {
        if (myList.size() == taget) {
            return;
        }
        myList.add(count);
        recur2(myList,count+1, taget);
        System.out.println(myList);
        myList.remove(myList.size()-1);

    }
}