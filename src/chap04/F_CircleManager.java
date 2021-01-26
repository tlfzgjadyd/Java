package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
public class F_CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        E_Circle c[]=new E_Circle[3]; //3개의 Circle 배열 선언
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble(); //x 값 읽기
            double y = scanner.nextDouble(); //y 값 읽기
            int radius = scanner.nextInt(); //반지름 읽기
            c[i]=new E_Circle(x, y, radius); //Circle 객체 생성
        }
        int biggest=0;
        for(int i=0;i<(c.length-1);i++)
            if(c[i].getRadius()<c[i+1].getRadius())
                biggest=i+1;
        System.out.print("가장 면적이 큰 원은 ");
        c[biggest].show();
        scanner.close();
    }
}