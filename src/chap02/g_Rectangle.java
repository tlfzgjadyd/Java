package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class g_Rectangle {
    public static void main(String[] args) {
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>=100&&x<=200&&y>=100&&y<=200)
            System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
        sc.close();
    }
}
