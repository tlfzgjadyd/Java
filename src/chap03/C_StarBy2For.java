package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class C_StarBy2For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int num = sc.nextInt();
        for(int i=num;i>0;i--) {
            for(int j=0;j<i;j++)
                System.out.print("*");
         System.out.println();
        }
    }

}
