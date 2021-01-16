package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class M_Calculate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        double calc1=sc.nextDouble();
        String calcType=sc.next(); //여기말인데 자바에는 문자 하나만 입력받는 기능은 없다함 char자료형은 있는거 맞음
        double calc2=sc.nextDouble(); //어쨌든 그래서 저렇게 sc.next()하고 문자열 들어온거에서 문자열명.charAt(index)로 뽑아씀
        double res = 0;

        //switch문으로 구분하시오 
        // -> 아까 switch문 안먹혔잖아 그 이유는 calcType는 아직 문자열인데 char타입이랑 비교하려 했어서 그렇다
        //    문자열명.charAt(0)으로 뽑아서 비교하니까 정상적으로 작동함 문자열이라 switch 안먹히는게 아니었다
        switch(calcType.charAt(0)){
            case '+' : res = calc1+calc2; break;
            case '-' : res = calc1-calc2; break;
            case '*' : res = calc1*calc2; break;
            case '/' : res = calc1/calc2; break;
            default : {System.err.println("잘못된 연산자 입력"); }break;
        }

        System.out.println(calc1+calcType+calc2+"의 계산 결과는"+res); //분명히 피연산자 실수로 하랬는데
        //갑자기 결과에 와서 소수점 없앤거 출력하기도 좀 그런데
        //문제에선 소수점 없이 출력함 근데 상관 없겠지뭐
        sc.close();
    }
}
