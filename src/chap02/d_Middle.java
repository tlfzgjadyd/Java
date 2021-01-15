package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class d_Middle {
    public static void main(String[] args) {
        System.out.print("정수 3개 입력>>");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int middle=num1;
        if((num2<=num1&&num2>=num3)||(num2>=num1&&num2<=num3))
            middle=num2;
        else if ((num3<=num1&&num3>=num2)||(num3>=num1&&num3<=num2))
            middle=num3;
        System.out.println("중간 값은"+middle);
        sc.close();
    }
}
