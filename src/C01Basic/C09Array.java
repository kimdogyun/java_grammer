package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C09Array {
    public static void main(String[] args) throws IOException {
//        배열표현식1. 배열을 선언 후 값 할당 방식
//        java의 배열은 반드시 사전에 길이가 결정되어야함
//        int[] arr1 = new int[]; - 허용안됨
//        int[] arr1 = new int[5];
//        arr1[0]=10;
////        int배열의 경우 선언시 기본적으로 0으로 초기화. boolean은 false로 초기화. 참조자료형은 null로 초기화
//        arr1[1]=20;
//        arr1[3]=40;
//        arr1[4]=50;
////        arr1[5]=60; //처음 선언한 배열 길이를 넘어가는 걸 추가하면 에러 index out of bounds 예외 발생.
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
//        int[]arr = {10,20,30,40,50};
//        int[] newArr = new int [arr.length];
//        for (int i =0;i<arr.length;i++){
//            newArr[arr.length-i-1] = arr[i];
//        }
//        int index=0;
//        for(int i=arr.length-1;i>=0;i--){
//            newArr[index] = arr[i];
//                    index++;
//        }


//        배열의 정렬
//        String test = "hello";
//
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr); //오름차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        Arrays.sort(stArr, Comparator.reverseOrder()); //내림차순
//        System.out.println(Arrays.toString(stArr));

//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); //오름차순 정렬
//        Arrays.sort(arr, Comparator.reverseOrder());  //원시자료형은 Comparator 사용 불가능

//        선택정렬 알고일즘 수현
//        구현로직 : 1)2중for문을 사용하여 index마다 최소값 찾기 2)현재위치와 자리 change
//        int[] arr = {17, 12, 20, 10, 15};
//        방법1
//        for(int i =0; i< arr.length;i++){
//            int min =arr[i];
//            int minIndex=i;
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[j]<min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
////                자리바꾸기 : i 와 index 자리 change
//            int temp = arr[i];
//            arr[i]=arr[minIndex];
//            arr[minIndex]=temp;
//
//            }
//      System.out.println(Arrays.toString(arr));
//        }
//        방법2
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        선택정렬의 복잡도 : 0(n^2) , java 기본 내장 정렬함수의 복잡도 : 0(n*log(n))

//        조합문제 : 모두 각기 다른 숫자의 배열이 있을떄, 만들어질수 있는 두 숫자의 조합
//        ex) (10,20) ,(10,30), (10,40), ( 10,50) , (20,30), (20,30) ...
//        int [] arr = {10,20,30,40,50};
//        for(int i =0; i< arr.length;i++){
//            for(int j =i+1;j< arr.length;j++){
//                System.out.println(arr[i]+","+arr[j]);
//
//            }
//
//
//        }

//        배열의 중복제거 : Set 자료구조(중복X,순서X)활용
//        ex) 10,20,30,40만 남도록.
//        int [] arr = {10,30,20,30,10,40};
//        Set<Integer> mySet = new HashSet<>();
//        for(int a : arr){
//            mySet.add(a);
//        }
//        int[]answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

//        프로그래머스 - 두개 뽑아서 더하기(조합+중복제거)

//
//        import java.util.HashSet;
//import java.util.Set;
//import java.util.Arrays;
// class Solution {
//            public int[] solution(int[] numbers) {
//                Set<Integer> hashSet = new HashSet<>();
//                for(int i = 0; i < numbers.length; i++) {
//                    for(int j = i + 1; j < numbers.length; j++) {
//                        hashSet.add(numbers[i]+numbers[j]);
//                    }
//                }
//
//                int[] answer = new int[hashSet.size()];
//                int index = 0;
//                for(int a : hashSet) {
//                    answer[index] = a;
//                    index++;
//                }
//                Arrays.sort(answer);
//                return answer;
//            }
//        }
//
//
//            }
//        }

//        배열의 검색
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target =11;
////        target이 몇번쨰 index에 있는지 출력
//        int index = -1;
//        for(int i =0; i< arr.length;i++){
//            if (arr[i]==target){
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

//        이분탐색(이진검색) - binary search, 복잡도 log(n)
//        사전에 데이터가 오름차순정렬돼 있는경우만 , 이분탐색 가능
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target =11;
////        찾고자 하는 값이 있으면 해당 index 리턴
////        찾고자 하는 값이 없으면 음수값 리턴
//        int index = Arrays.binarySearch(arr, target);
//        int index2 = Arrays.binarySearch(arr, 13);
//        System.out.println(index);
//        System.out.println(index2);

//        백준 -1920번 수 찾기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[]starr1 = br.readLine().split(" ");
//        int [] arr = new int [starr1.length];
//
//
//        for(int i = 0;i< arr.length;i++){
//            arr[i]=Integer.parseInt(starr1[i]);
//        }
//        Arrays.sort(arr);
//        int M =Integer.parseInt(br.readLine());
//        String[] starr2= br.readLine().split(" ");
//        for(int i =0;i<starr2.length;i++){
//            int temp =Integer.parseInt(starr2[i]);
//            if(Arrays.binarySearch(arr,temp)>=0
//        }else{

//        }
//
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int[] n = new int[Integer.parseInt(br.readLine())];
//
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n.length; i++) {
//            n[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(n);
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < m; i++) {
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(Arrays.binarySearch(n, b) >= 0 ? 1 : 0).append("\n");
//        }
//
//        System.out.println(sb);

//        배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2);//false
//        System.out.println(Arrays.equals(arr1,arr2));//true

//        배열복사
//        Araays.copyOf(배열명, length), Araays.copyOfRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr,4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr2));

//        Arrats.fill : 배열에 모든값을 변경(채우기)
//        String[] arr = new String[5];
//        for(int i =0;i<arr.length;i++){
//            arr[i]= " ";
//        }
//        Arrays.fill(arr, " ");


//        2차원 배열의 선언과 값 할당
//        {{1,2},{1,2},{1,2}}
////        방법1. 선언 후 할당 방식
//        int[][] arr1 = new int [3][2];
//        arr1 [0][0]=1;
//        arr1 [0][1]=2;
//        arr1 [1][0]=1;
//        arr1 [1][1]=2;


//        방법2. 리터럴방식
//        int[][] arr2 = {{1,2},{1,2},{1,2}};
//
////        [3][4]사이즈의 2차원 배열을 선언하고,1~12까지 숫자값을 각 배열에 순차적으로 할당
////        {{1,2,3,4}, {5,6,7,8} {9,10,11,12}}
//        int[][] arr = new int [3][4];
//        int num =1;
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;j<arr[i].length;j++){
//                arr[i][j]=num;
//                num++;
//            }
//        }
////        2차원 배열의 출력
//        System.out.println(arr); // 2차원배열의 heap 주소값
//        System.out.println(Arrays.toString(arr)); // 각 1차원 배열의 heap 주소값
//        System.out.println(Arrays.deepToString(arr)); //각 1차원 배열의 값을 출력

//        프로그래머스 - 행렬의 덧셈

//        class Solution {
//            public int[][] solution(int[][] arr1, int[][] arr2) {
//                int [][] answer = new int [arr1.length][arr1[0].length];
//                for(int i = 0; i< arr1.length;i++){
//                    for(int j = 0;j<arr1[i].length;j++){
//                        answer[i][j] =arr1[i][j]+arr2[i][j];
//                    }
//                }
//                return answer;




//        프로그래머스 - K번쨰 수(Arrays.copyOfRange)
//                int[] answer = new int [commands.length];
//                for(int i =0; i<answer.length;i++){
////                    잘라서 새로운 배열을 만든다.
//
////                    만들어진 배열을 정렬한다.
//
////                    원하는 값을 구해서 answer에 담는다.
//                }

//        가변배열 : 2차원 배열에서 각 1차원의 배열의 길이가 서로 다를수 있는 배열의 구조
        int[][] arr1 = {{1,2},{1,2,3},{1,2,3,4}};

//        배열 전체길이는 반드시 사전할당되어야 하지만, 1차원배열의 길이는 추후 할당가능
        int[][] arr2 = new int[3][];
        arr2[0] = new int [2];
        arr2[1] = new int [3];
        arr2[2] = new int [4];






    }
}

