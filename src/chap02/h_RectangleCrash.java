package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class h_RectangleCrash {
    
    //문제에서 제공되는 함수,
    // 점 (x, y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴한다
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1 &&x<=rectx2) && (y >=recty1 && y <= recty2))
            return true;
        else return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 점의 x좌표를 입력하시오>>");
        int x1=sc.nextInt();

        System.out.print("첫번째 점의 y좌표를 입력하시오>>");
        int y1=sc.nextInt();

        System.out.print("두번째 점의 x좌표를 입력하시오>>");
        int x2=sc.nextInt();

        System.out.print("두번째 점의 y좌표를 입력하시오>>");
        int y2=sc.nextInt();

        boolean res1=inRect(x1, y1, 100, 100, 200, 200);
        boolean res2=inRect(x2, y2, 100, 100, 200, 200);

        if(res1||res2)
            System.out.println("직사각형이 충돌합니다");
        else
            System.out.println("충돌하지 않습니다");

        sc.close();
    }
}
