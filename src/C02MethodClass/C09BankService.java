package C02MethodClass;
  /*
        <계좌개설 및 입출금 서비스>
        1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
        2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
            3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
            3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
            3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
            3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
            3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
        4.주의사항
            4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
            4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
         */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C09BankService {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, BankAccount> ba = new HashMap<>();
        ba.put("11111", new BankAccount("hong1", "11111", 1000000));
        ba.put("22222", new BankAccount("hong2","22222",500000));
        ba.put("33333",new BankAccount("hong3","33333",300000));
        ba.put("44444",new BankAccount("hong4","44444",200000));
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("사용하실 서비스 번호를 누르세요 1)계좌개설 2)계좌조회 3)입금 4)출금 5)송금");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1) {
                System.out.println("계좌개설");
                System.out.println("이름 , 사용하실 계좌번호, 가지고있는 돈 입력");
                String name = sc.nextLine();
                String accountnumber= sc.nextLine();
                long balance = Long.parseLong(sc.nextLine());
                if(ba.containsKey(accountnumber)){
                    System.out.println("계좌번호 중복");
                }else{
                    ba.put(accountnumber,new BankAccount(name,accountnumber,balance));
                }

            } else if (number == 2) {
                System.out.println("계좌조회");
                System.out.println("계좌번호 입력");
                String accountnumber = sc.nextLine();
                BankAccount b1 = ba.get(accountnumber);
                System.out.println("계좌주: "+b1.getName()+"계좌번호"+b1.getAccountnumber());

            } else if (number == 3) {
                System.out.println("입금");
                System.out.println("계좌번호 입력");
                String accountnumber = sc.nextLine();
                System.out.println("입금금액 입력");
                long money = Long.parseLong(sc.nextLine());
                BankAccount b1 = ba.get(accountnumber);
                System.out.println("입금전");
                b1.deposit(money);

            } else if (number == 4) {
                System.out.println("출금");
                System.out.println("계좌번호, 출금금액 입력");

            } else if (number == 5) {
                System.out.println("송금");
                System.out.println("본인 게좌번호,상대 계좌번호,송금금액 입력");

            } else {
                System.out.println("잘못된 번호");

            }
        }
    }
}
class BankAccount{
    private Long id;
    private String name;
    private String accountnumber;
    private long balance;
    private static long staticid;

    public BankAccount(String name,String accountnumber,long balance){
    staticid++;
    this.id=staticid;
    this.name=name;
    this.accountnumber=accountnumber;
    this.balance=balance;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public long getBalance() {
        return balance;
    }
    public void transfer(BankAccount tagetAccount,long money){
        if(this.balance<money){
            return;
        }
        this.balance-=money;
        tagetAccount.balance+=money;
    }
    public void deposit(long money){
        this.balance+=money;

    }

    public boolean checkBalance(long money){
        if(this.balance<money){
            return false;
        }else {
            return true;
        }
    }
    public void withdraw(long money){
        this.balance-=money;

    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}



