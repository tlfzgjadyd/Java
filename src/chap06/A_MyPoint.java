package chap06;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//여기서 포인트는 println 오버라이딩 자체는 불가능하고
//대신 String클래스가 그냥 출력되도록 변경되었듯이
//새로 만든 클래스에서도 toString을 오버라이딩하면 알아서 println도 바뀐다
//이때 toString은 리턴타입은 언제나 String이다
class MyPoint{
    private int x;
    private int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return ("Point("+x+","+y+")");
    }
}
public class A_MyPoint {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른점");
    }
}
