package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의
* 
* 그리고 이건 문제 의도랑 달리 2중 반복문도 안썼음*/

import java.util.Scanner;

public class C_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            System.out.print("*");
            if (i == (num - 1)) {
                num--;
                i = 0;
                System.out.println();
            }
        }
    }

}
