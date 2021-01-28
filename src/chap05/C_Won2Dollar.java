package chap05;

import java.util.Scanner;
abstract class Converter{
    abstract protected double convert(double src); //추상 메소드
    abstract protected String getSrcString(); //추상 메소드
    abstract protected String getDestString(); //추상 메소드
    protected double ratio; //비율

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 "+getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " +res + getDestString()+"입니다");
        scanner.close();
    }
}
class Won2Dollar extends Converter{
    private int money;
    Won2Dollar(int money){
        this.money = money;
    }
    protected double convert(double src){
        return (src/1200);
    }
    protected String getSrcString(){
        return "원";
    }
    protected String getDestString(){
        return "달러";
    }
}

public class C_Won2Dollar {
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200); //1달러는 1200원
        toDollar.run();
    }
}
