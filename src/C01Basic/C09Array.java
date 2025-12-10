package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C09Array {
    public static void main(String[] args) {
//        배열표현식1. 배열을 선언 후 값 할당 방식
//        java의 배열은 반드시 사전에 길이가 결정되어야함
//        int[]arr1 = new int[]; - 허용안됨
//        int[] arr1 = new int[5];
//        arr1[0]=10;
////        int배열의 경우 선언시 기본적으로 0으로 초기화. boolean은 false로 초기화. 참조자료형은 null로 초기화
//        arr1[1]=20;
//        arr1[3]=40;
//        arr1[4]=50;
////        arr1[5]=60; //index out of bounds 예외 발생.
//
////        배열표현식2. 리터럴방식
//        int[]arr2={10,20,30,40,50};
//
////        배열표현식3.명시적배열생성방식
//        int[]arr3 = new int[]{10,20,30,40,50};
//
////        배열표현식3.활용예시 : 배열을 다른 메서드의 매개변수로 사용할 경우.
//        List<int[]> myLlist = new ArrayList<>();
//        myLlist.add(new int[3]);
////        myLlist.add({10,20,30,40,50});//사용불가(배열인지 아닌지 확인불가)
//        myLlist.add(new int[]{10,20,30,40,50});

//        85,65,90으로 구성된 int배열을 선언하고 총합과 평균을 구하시오.
//        int []arr =new int[] {85,65,90};
//        int sum = 0;
//        double avg=0;
//        for(int i = 0;i< arr.length; i++){
//        sum+=arr[i];
//            {
//                double avg = (double) sum/ arr.length;
//                System.out.println(sum);
//                System.out.println(avg);
//            }

//            배열의 최대값, 최소값
//            int [] arr = {10,20,30,12,8,17};
////            최대값을 구할떄는 가장 작은 값을 설정.
//            int max = Integer.MIN_VALUE;
//        //        최소값을 구할떄는 가장 작은 값을 설정.
//        int min= Integer.MAX_VALUE;
//
//        for(int i =0; i< arr.length;i++){
//                if(arr[i]>max){
//                    max=arr[i];
//                }if(arr[i]<min){
//                    min =arr[i];
//                }
//
//            }
//        배열 자리 바꾸기
//        int [] arr = {20,0,30};
//        int temp = arr[0];
//        arr[0]=arr[1];
//        arr[1]=temp;

//        배열뒤집기
        int[]arr = {10,20,30,40,50};
        int[] newArr = new int [arr.length];
        for (int i =0;i<arr.length;i++){
            newArr[arr.length-i-1] = arr[i];
        }
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            newArr[index] = arr[i];
                    index++;
        }







    }
}
