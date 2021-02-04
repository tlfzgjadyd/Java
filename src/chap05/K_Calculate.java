package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//Calc calc 선언만 해놓고 switch에서 나눠서 calc객체 만들고
//그 이후에는 calc.calculate();하려고 했는데 객체가 초기화 안돼있다고 에러났음
//그래서 어쩔수없이 switch문 안에 다른 함수도 실행하는 등 해봤지만
//똑같은 코드가 4번이나 겹치는게 마음에 안들었음 안그래도 문제에서
//이전 문제의 코드 중복 문제 해결하려고 추상클래스 만들라한건데말이지
//그래서 어떻게 하다가 null로 초기화 하면 되는걸 깨달음

import java.util.Scanner;
abstract class Calc{
    private int a;
    private int b;

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    abstract public int calculate();
}
class Add extends Calc{
    public int calculate(){
        return (getA()+getB());
    }
}
class Sub extends Calc{
    public int calculate(){
        return (getA()-getB());
    }
}
class Mul extends Calc{
    public int calculate(){
        return (getA()*getB());
    }

}
class Div extends Calc{
    public int calculate(){
        return (getA()/getB());
    }
}
public class K_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char type = sc.next().charAt(0);
        Calc calc=null;
        switch(type){
            case '+' : calc = new Add(); break;
            case '-' : calc = new Sub(); break;
            case '*' : calc = new Mul(); break;
            case '/' : calc = new Div(); break;
            default : ; break;
        }
        calc.setValue(a, b);
        System.out.println(calc.calculate());
    }
}
