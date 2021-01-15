package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class f_Game369 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if((num/10)%3==0)
            count++;
        if((num%10)%3==0)
            count++;
        System.out.print("박수");
        for (int i=0;i<count;i++)
            System.out.print("짝");
        sc.close();
}}
