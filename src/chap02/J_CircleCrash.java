package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class J_CircleCrash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double r1=sc.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double r2=sc.nextDouble();

        if(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))<=(r1+r2))
            System.out.println("두 원은 서로 겹친다");
        else
            System.out.println("겹치지 않는다");

        sc.close();

    }
}
