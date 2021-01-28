package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

class ColorPoint2 extends Point{
    String color;
    ColorPoint2(){
        super(0, 0);
        this.color="BLACK";
    }
    ColorPoint2(int x, int y){
        super(x, y);
        this.color = "BLACK";
    }
    ColorPoint2(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y){
        super.move(x, y);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return (color+"색의 ("+getX()+","+getY()+")의 점");
    }
}
public class F_ColorPoint2 {
    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); //(0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString()+ "입니다.");

        ColorPoint2 cp = new ColorPoint2(10, 10); //(10, 10) 위치의 BLACK 색 점
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
