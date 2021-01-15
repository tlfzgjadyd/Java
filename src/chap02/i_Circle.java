package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class i_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        double circleX=sc.nextDouble();
        double circleY=sc.nextDouble();
        double radius=sc.nextDouble();
        System.out.print("점 입력>>");
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        double distance = Math.sqrt(Math.pow((circleX-x),2)+Math.pow((circleY-y),2));
        if(distance<=radius)
            System.out.println("점 ("+x+", "+y+")는 원 안에 있다");
        else
            System.out.println("점 ("+x+", "+y+")는 원 밖에 있다");
        sc.close();
    }
}
