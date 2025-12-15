package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {
//        ArrayList (리스트)
//        장점 : 조회성능빠름
//        단점 : 중간값 삭제 remove 성능저하
//        LinkedList (큐)
//        장점 : 맨앞의 값 삭제 성능빠름
//        단점 : 조회성능저하

//        Queue 인터페이스를 LinkedList를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myque =new LinkedList<>();
//        myque.add(10);
//        myque.add(20);
//        myque.add(30);
////        poll은 큐에서 가장 앞의 데이터를 삭제하면서 동시에 return하는 메서드
//        int value =myque.poll();
//        System.out.println(value); //10
//        System.out.println(myque); //20,30
////        peek은 큐에서 가장 앞의 데이터를 삭제하지 않고, 가장 앞의 데이터를 return 하는 메서드
//        int value2 = myque.peek();
//        System.out.println(value2); //20
//        System.out.println(myque); //20,30

//        while문을 통한 queue 출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
////        큐는 일반적으로 while문을 통해 요소를 소모
//        while(!printerQueue.isEmpty()){
//            System.out.println(printerQueue.poll());
//        }
//        LinkedList와 ArrayList 성능차이 비교
//        ArrayList 장점 : 조회성능 빠름 , 단점 : 중간 삽입/삭제 성능 저하
//        LinkecList 장점 : 중간 삽입/삭제 성능빠름 , 단점 : 조회 성능저하
//        LinkedList<Integer> myLlinkedList = new LinkedList<>();
//        long starttime = System.currentTimeMillis();
//        for(int i=0;i<1000000;i++){
//            myLlinkedList.add(0,i);
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println("linkedlist에 중간에 값 add시에 소요시간:"+(endtime-starttime));
//
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long starttime2 = System.currentTimeMillis();
//        for(int i=0;i<1000000;i++){
//            myArrayList.add(0,i);
//        }
//        long endtime2 = System.currentTimeMillis();
//        System.out.println("arraylist에 중간에 값 add시에 소요시간:"+(endtime2-starttime2));

//        백준 카드2,요세푸스 문제 0

//        길이제한큐
        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); //길이 초과시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); //제한된 길이까지만 add. 에러발생 x
//        System.out.println(blockingQueue);

//        우선순위 큐 : 데이터를 poll할 떄 정렬된 데이터결과값(최소값/최대값) 보장
//        지속적으로 데이터가 추가/제거 되면서 전체데이터가 실시간으로 변경되는 상황에 사용
//        Queue<Integer>pq =new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while(!pq.isEmpty()){
////            poll할때마다 최소값을 추출하게되고,복잡도 log(n) . peek은 최소값을 확인만하고 추출은 x,복잡도 log(n)
////            전체 데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }

//        백준 : 최소힙

//        프로그래머스 : 더 맵게

//        최대 힙 : poll할때마다 최대값을 추출
//        Queue<Integer>pq2 =new PriorityQueue<>(Comparator.reverseOrder());


//        stack : 후입선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); // 가장 마지막에 입력한 값을 꺼내는 것
//        System.out.println(myStack.peek()); //가장 마지막에 입력한 값을 확인만 하는 것
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());

//        프로그래머스 : 올바른 괄호

//        프로그래머스 : 같은 숫자는 싫어

//        deque : addFirst,addLast,pollFirst,pollLast,peekFirst,peekLast
        Deque<Integer>myDeque = new ArrayDeque<>();
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addFirst(30); // 30,10,20
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.pollFirst());
        System.out.println(myDeque.pollFirst());
    }



}
