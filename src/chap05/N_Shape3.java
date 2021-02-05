package chap05;

import java.text.DecimalFormat;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//소숫점 조정은 못하겠음 그래서 조금 다름
class Oval implements Shape{
    private int a=0;
    private int b=0;
    Oval(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void draw(){
        System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
    }
    public double getArea(){
        return (a*b*PI);
    }
}
class Rect implements Shape{
    private int xLength=0;
    private int yLength=0;
    Rect(int xLength, int yLength){
        this.xLength = xLength;
        this.yLength = yLength;
    }
    public void draw(){
        System.out.println(xLength+"x"+yLength+"크기의 사각형입니다.");
    }
    public double getArea(){
        return ((double)(xLength*yLength));
    }
}
public class N_Shape3 {
    public static void main(String[] args) {
        Shape [] list = new Shape[3]; //Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new Circle(10); //반지름이 10인 원 객체
        list[1] = new Oval(20, 30); //20x30 사각형에 내접하는 타원
        list[2] = new Rect(10, 40); //10x40 크기의 사각형

        for(int i=0;i<list.length;i++) list[i].redraw();
        for(int i=0;i<list.length;i++)System.out.println("면적은 "+list[i].getArea());
    }
}
