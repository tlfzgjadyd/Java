package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class D_RectangleMain {
    public static void main(String[] args) {
        D_Rectangle r = new D_Rectangle(2, 2, 8, 7);
        D_Rectangle s = new D_Rectangle(5, 5, 6, 6);
        D_Rectangle t = new D_Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
