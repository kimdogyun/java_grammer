package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C06LoopStatmeneAdvance {
    public static void main(String[] args) {
//        1~20까지 수 중에 짝수의 충합 출력
//        int total =0;
//        for (int i = 1; i < 21; i++) {
//
//            if (i % 2 == 0) {
//                total +=i;
//            }
//
//            }
//        System.out.println(total);

//        두수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a > b ? b : a; //Math.min(a,b);
//        int answer = 0;
//        for (int i = 1; i < min + 1; i++) {
//            if (a % i == 0 && b % i == 0) {
//                answer = i;
//            }
//        }
//        for (int i = min; i > 0; i--) {
//            if (a % 1 == 0 && b % 1 == 0) {
//                answer = 1;
//                break;
//            }
//        }
//        System.out.println(answer);
//    }
//}

//          소수인지 여부 판별 소수란 1과 자신을 제외한 숫자로 나누어지지 않는 1보다 큰 수
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i*i <= a; i++) {
//            if (a % i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (check || a==1) {
//            System.out.println("소수 아님");
//        } else {
//            System.out.println("소수");
//        }
//
//    }
//}

//        int[] arr = {1, 3, 5, 7};
////   일반 for문을 통한ㄴ 배열 접근 방식
////        for (int i = 0; i = arr.length; i++) {
////            System.out.println(i);
////        }
//
//
////    향상된 for문 (enhanced for 문 , for each문)을 통한 배열 접근 방신
////        for (int a : arr) {
////            System.out.println(a);
////        }
////    }
////}
//
////    일반 for문을 통한 arr의 저장된 값 변셩
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 10;
//        }
////        참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
////        그래서, 내장된 메서드를 통해 힙메모리안의 객체값을 보기좋게 출력할수 있음.
//        System.out.println(Arrays.toString(arr));
//
////        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//        for (int a : arr){
//
//        }
//        자바 변수의 유효범위 : {}
//        int num1 = 10;
//        if(true){
//            num1=20;
//            int num2 = 30;
//        }
//        하위 영역의 블록(중괗오)에서 정의된 변수는 상위 블록에서는 접근불가

//        for문은 사용했던 변수명을 for문이 끝난 이휴에 또다른 for문에서 재선언이 가능
//        for(int i =0;i<10;i++){
//            System.out.println(i);
//        }
//
//
//        for(int i =0;i<10;i++){
//        System.out.println(i);
//    }
//


//        다중 for문
//        2~9단까지 모든 구구단 한꺼번에 출력
//        2단입니다.를 먼저 출력후에 2X1=2,2X2=4,2x3=6



        for(int i=2; i<=9; i++){
            System.out.println(i+"단입니다");
            for (int a=1;a<=9;a++){
            System.out.println(i+"X"+a+"="+(i*a));
        }
    }



//      라벨문 : 반복문에 이름을 붙이는것
        loop1:
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                if(true){
//                    원하는 for문을 라벨링을 통해 break 또는 continue 시킬수 있음
                    break loop1;
                }
            }
        }
    }
}


//        스택 : 기본형변수, 참조형변수의 힙메모리주소값
//        힘 : 참조형변수값
