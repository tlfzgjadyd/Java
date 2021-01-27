package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//charAt은 잘 기억하고 있었고 switch할때 case +는 가끔 case '+'로 감싸는걸 필요로 한다는것
import java.util.Scanner;
class Add{
    private int a;
    private int b;
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return (a+b);
    }
}
class Sub{
    private int a;
    private int b;
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return (a-b);
    }
}
class Mul{
    private int a;
    private int b;
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return (a*b);
    }
}
class Div{
    private int a;
    private int b;
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return (a/b);
    }
}
public class K_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=0;
        char calc = sc.next().charAt(0);
        switch(calc){
            case '+' : {add.setValue(a,b); res=add.calculate();}break;
            case '-' : {sub.setValue(a,b); res=sub.calculate();}break;
            case '*' : {mul.setValue(a,b); res=mul.calculate();}break;
            case '/' : {div.setValue(a,b); res=div.calculate();}break;
        }
        System.out.println(res);
    }
}
