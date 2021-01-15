package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class a_Scanner {
    public static void main(String[] args) {
        System.out.print("원화를 입력하세요(단위 원)>>");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money+"원은 $"+(money/(double)1100)+"입니다.");
        sc.close();
    }
}
