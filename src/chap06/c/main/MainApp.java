package chap06.c.main;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import chap06.c.etc.Calc;

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10, 20);
        System.out.println(c.sum());
    }
}
