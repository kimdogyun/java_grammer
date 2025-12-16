package C02MethodClass;
import java.util.ArrayList;
import java.util.List;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
        Account a = new Account();
        a.setName("kim");
        a.setAccountnumber("12345");
        a.setBalance(100000);
//        List를 계좌객체를 담는 자료구조로 사용(2~3대)
        List<Account> myList = new ArrayList<>();
        myList.add(a);
        myList.add(new Account("hong", "54321", 50000));
        myList.add(new Account("lee", "55555", 50000));
//        계좌1("12345")에서 계좌2("54321"로 송금(5000) : 잔고 변경 메서드 필요
//        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산

        for (Account x : myList) {
            if (x.getAccountnumber(x).equls("12345"))(x.balance-50000)
            if (x.getAccountnumber(x).equls("54321"))(x.balance+50000)
        }
    }
}
//Account 클래스 - 계좌주명(name), 계좌번호(accountnumber String), 잔고(balance long)
        class Account {
            private String name;
            private String accountnumber;
            private long balance;

            public Account(String name, String accountnumber, long balance) {
            this.name=name;
            this.accountnumber=accountnumber;
            this.balance=balance;
            }
            public Account() {
            }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
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
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

