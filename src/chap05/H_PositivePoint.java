package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//작동이 이상하다 했더니 3번째 출력은 아예 다른객체로 하는거였음
//그래서 생성자에서도 음수인거 막아줘야 에러 안나는거였음
//게다가 그냥 move부르는것도 아니고 super.move불러야됐다
class PositivePoint extends Point{
    PositivePoint(){
        super(0, 0);
    }
    PositivePoint(int x, int y){
          super(x, y);
          if(getX()<0||getY()<0)
              super.move(0, 0);
    }
    public void move(int x, int y){
        if(x>=0&&y>=0)
            super.move((x+getX()), (y+getY()));
    }
    public String toString(){
        return ("("+getX()+","+getY()+")");
    }
}

public class H_PositivePoint {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5); //객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
