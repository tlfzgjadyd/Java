package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class E_Circle {
    private double x, y;
    private int radius;
    public E_Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;//x, y, radius 초기화
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    int getRadius(){
        return radius;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
    void setRadius(){
        this.radius = radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
}