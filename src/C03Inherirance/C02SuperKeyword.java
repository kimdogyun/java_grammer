package C03Inherirance;

import java.util.logging.XMLFormatter;
//부모클래스를 상속 받을떄, 자식객체의 생성자에서는 부모객체를 자동으로 생성.
//이떄, 부모클래스에 기본생성자가 없으면 자식클래스에서 에러발생
public class C02SuperKeyword extends superParents {
    int a = 20;
    public C02SuperKeyword(){
//        supser() : 부모클래스의 생성자를 호출하는 메서드
        super(10);
        this.a=20;
    }
    public static void main(String[] args) {
        C02SuperKeyword c1 = new C02SuperKeyword();
        c1.display();
    }
    public void display() {
        System.out.println("자식의 변수 : " + this.a);
//        부모의 변수나 메서드에 접글할때에는 super 키워드를 사용
        System.out.println("부모의 변수 : " + super.a);
    }
}
class superParents{
    int a=10;

    public superParents(int a){
        this.a=a;
    }
}
//1.Animal이름의 클래스 생성
//void sound() 메서드 : "동물 소리를 냅니다" 출력


//2.dog이름의 클래승 생성
//Animal 클래스를 상속
//sound2()메서드 : "멍멍"출력

//3.cat이름의 클래스 생성
//Animal 상속 sound2()"야옹"출력

//4.AnimalMain
//Dog 객체 생성 후 sound2 메서드 호출
//cat 객체 생성 후 sound1 메서드 호출