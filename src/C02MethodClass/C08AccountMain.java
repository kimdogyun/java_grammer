package C02MethodClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
// 계좌개설(객체생성)
// List를 계좌객체를 담는 자료구조로 사용(2~3대)
//        List<Account> myList = new ArrayList<>();
//        myList.add(new Account("kim","12345",100000));
//        myList.add(new Account("hong", "54321", 50000));
//        myList.add(new Account("lee", "55555", 50000));
//// 계좌1("12345")에서 계좌2("54321"로 송금(5000) : 잔고 변경 메서드 필요
//// 내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산
//
//        long money = 50000;
//        for (Account x : myList) {
//            if (x.getAccountnumber().equals("12345")) {
//                x.setBalance(x.getBalance() - money);
//            }
//            if (x.getAccountnumber().equals("54321")) {
//                x.setBalance(x.getBalance() + money);
//            }
//            System.out.println(x);
//        }
//    }
//    Map을 계좌객체를 담는 자료구조로 사용
    Map<String,Account> accountmap = new HashMap<>();
    accountmap.put("12345",new Account("kim","12345",100000));
    accountmap.put("54321",new Account("hong","54321",0));

    Account a =accountmap.get("12345");
    Account b =accountmap.get("54321");
    a.transfer(b,50000);
        System.out.println(accountmap);

}
}
//Account 클래스 - 계좌주명(name), 계좌번호(accountnumber String), 잔고(balance long)
class Account {
//    참조자료형은 초기값 null
//    원시자료형은 각 자료형에 맞는 초기값
    private Long id;
    private String name;
    private String accountnumber;
    private long balance;
    private static long staticid;

    public Account(String name, String accountnumber, long balance) {
        staticid++;
        this.id=staticid;
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;

    }
//    setBalnce보다는 의도를 명확히한 메서드명을 사용하기를 권장
    public void setBalance(long balance) {

        this.balance = balance;
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
    public void transfer(Account tagetAccount,long money){
        if(this.balance<money){
            return;
        }
//        송금할객체에 돈을 차감
        this.balance-=money;
//        송금받을객체에 돈을 가산
        tagetAccount.balance+=money;

    }
    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

