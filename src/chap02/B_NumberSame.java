package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class B_NumberSame {
    public static void main(String args[]){
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num/10)==(num%10))
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("다릅니다");

        sc.close();
    }
}
