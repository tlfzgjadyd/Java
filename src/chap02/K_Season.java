package chap02;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;

public class K_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int month=sc.nextInt();
        switch(month){
            case 3 : ;
            case 4 : ;
            case 5 : System.out.println("봄") ;break;
            case 6 : ;
            case 7 : ;
            case 8 : System.out.println("여름") ;break;
            case 9 : ;
            case 10 : ;
            case 11 : System.out.println("가을") ;break;
            case 12 : ;
            case 1  : ;
            case 2  : System.out.println("겨울") ;break;
            default : System.out.println("잘못 입력");break;

        }
        
        sc.close();

    }
}
