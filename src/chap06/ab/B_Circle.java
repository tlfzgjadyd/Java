package chap06.ab;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//문제에서 따로 언급은 없었지만 출력떄문에 toString도 오버라이딩 해줘야하는게 포인트
//그리고 toString의 경우 오버라이딩할떄 public 안붙여주면 에러나더라
class Circle{
    private int x;
    private int y;
    private int radius;
    Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public boolean equals(Circle otherCircle){
        if((this.x==otherCircle.x)&&(this.y== otherCircle.y))
            return true;
        else
            return false;
    }
    public String toString(){
        return ("Circle("+x+","+y+")반지름"+radius);
    }
}

public class B_Circle {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); //중심 (2,3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : "+a);
        System.out.println("원 b : "+b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
