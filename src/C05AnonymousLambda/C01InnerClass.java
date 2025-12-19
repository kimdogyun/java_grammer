package C05AnonymousLambda;
//내부클래스  : 클래스 안에 클래스
//1)static내부클래스 2)익명내부클래스
public class C01InnerClass {
    public static void main(String[] args) {
//       staic 내부 클래스를 활용한 객체 생성
        member.MemberInner m1 = new member.MemberInner(20);
        System.out.println(m1.getB());

    }
}
class member{
    private int a;

    public member(int a) {
        this.a = a;
    }

    public int getA(){
        return this.a;
    }
//    static 내부클래스 : Member의 static 변수처럼 활용
    static class MemberInner{
        private int b;

        public MemberInner(int b) {
            this.b = b;
        }

        public int getB(){
            return b;
        }
    }
}