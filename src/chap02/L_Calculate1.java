package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class L_Calculate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        double calc1=sc.nextDouble();
        String calcType=sc.next(); //여기말인데 자바에는 문자 하나만 입력받는 기능은 없다함 char자료형은 있는거 맞음
        double calc2=sc.nextDouble(); //어쨌든 그래서 저렇게 sc.next()하고 문자열 들어온거에서 문자열명.charAt(index)로 뽑아씀
        double res = 0;
        
        //if-else문으로 구분하시오
        if (calcType.charAt(0)=='+')
            res = calc1+calc2;
        else if (calcType.charAt(0)=='-')
            res = calc1-calc2;
        else if (calcType.charAt(0)=='*')
            res = calc1*calc2;
        else if (calcType.charAt(0)=='/')
            res = calc1/calc2;
        else
            System.err.println("잘못된 연산자 입력");

        System.out.println(calc1+calcType+calc2+"의 계산 결과는"+res); //분명히 피연산자 실수로 하랬는데
                                                                    //갑자기 결과에 와서 소수점 없앤거 출력하기도 좀 그런데
                                                                    //문제에선 소수점 없이 출력함 근데 상관 없겠지뭐
        sc.close();
    }
}
