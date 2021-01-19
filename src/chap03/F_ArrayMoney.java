package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
public class F_ArrayMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();
        int[] unit = {50000,10000,1000,500,100,50,10,1}; //환산할 돈의 종류
        int[] num = new int[unit.length];
        for (int i=0;i<unit.length;i++) {
            num[i] = money / unit[i];
            money -= num[i] * unit[i];
            if(num[i]!=0)
                System.out.println(unit[i]+"원 짜리 : "+num[i]+"개");
        }
        sc.close();
    }
}
