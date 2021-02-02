package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//아 이거 문제 인쇄 에러났는데 가장 긴 변의 길이가 나머지 두변 합보다 작아야됨
import java.util.Scanner;

public class E_Triangle {
    public static void main(String[] args) {
        System.out.print("정수 3개를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>=num2&&num1>=num3)
        {
            if((num2+num3)>num1)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("두 변의 합이 다른 한 변보다 커야합니다");
        }
        else if(num2>=num1&&num2>=num3)
        {
            if((num1+num3)>num2)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("두 변의 합이 다른 한 변보다 커야합니다");

        }
        else{
            if((num1+num2)>num3)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("두 변의 합이 다른 한 변보다 커야합니다");
        }

        sc.close();
    }
}
