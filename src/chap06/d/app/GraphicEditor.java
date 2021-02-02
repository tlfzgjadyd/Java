package chap06.d.app;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import chap06.d.base.Shape;
import chap06.d.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
