package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

class Point3D extends Point{
    private int z;
    Point3D(int x, int y, int z){
        super(x, y);
        this.z=z;
    }
    public int getZ(){
        return z;
    }
    public void moveUp(){
        z++;
    }
    public void moveDown(){
        z--;
    }
    public void move(int x, int y, int z){
        super.move(x, y);
        this.z+=z;
    }
    public String toString(){
        return ("("+getX()+","+getY()+","+getZ()+")의 점");
    }
}

public class G_Point3D {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3); //1, 2, 3은 각각 x, y, z축의 값
        System.out.println(p.toString()+"입니다.");

        p.moveUp(); //z축으로 위쪽 이동
        System.out.println(p.toString()+"입니다.");

        p.moveDown(); //z축으로 아래쪽 이동
        p.move(10, 10); //x, y축으로 이동
        System.out.println(p.toString()+"입니다.");

        p.move(100, 200, 300); //x, y, z축으로 이동
        System.out.println(p.toString()+"입니다");
    }
}
