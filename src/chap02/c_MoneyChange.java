package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class c_MoneyChange {
    public static void main(String[] args) {
        System.out.print("금액을 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int m1=money/50000;
        money-=(m1*50000);

        int m2=money/10000;
        money-=(m2*10000);

        int m3=money/1000;
        money-=(m3*1000);

        int m4=money/100;
        money-=(m4*100);

        int m5=money/50;
        money-=(m5*50);

        int m6=money/10;
        money-=(m6*10);

        int m7=money;

        System.out.println("오만원권 "+m1+"매");
        System.out.println("만원권 "+m2+"매");
        System.out.println("천원권 "+m3+"매");
        System.out.println("백원 "+m4+"개");
        System.out.println("오십원 "+m5+"개");
        System.out.println("십원 "+m6+"개");
        System.out.println("일원 "+m7+"개");

        sc.close();
    }
}
