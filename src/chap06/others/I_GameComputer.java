package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//문제는 Random 사용할때 소문자 메소드여야했다는것
//다른곳 어딘가에서 Random으로 썼었는데 뭐지 코틀린인가
//어쨌든 여기서는
//1. import java.lang.Math;
//2. (int)(Math.random()*3+1);

import java.util.Scanner;
import java.lang.Math;

public class I_GameComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        int selectInt = sc.nextInt();
        String selectString="";
        switch(selectInt){
            case 1: selectString="가위";break;
            case 2: selectString="바위";break;
            case 3: selectString="보";break;
            case 4: {sc.close(); System.exit(0);}break;
            default: ; break;
        }
        int computerInt =(int)(Math.random()*3+1);
        String computerString="";
        switch(computerInt){
            case 1: computerString="가위";break;
            case 2: computerString="바위";break;
            case 3: computerString="보";break;
            default: ; break;
        }
        System.out.println("철수("+selectString+") : 컴퓨터("+computerString+")");
        int distance = computerInt-selectInt;
        if(distance==0)
            System.out.println("비겼습니다.");
        else if(distance==1 || distance==-2)
            System.out.println("컴퓨터가 이겼습니다.");
        else
            System.out.println("철수가 이겼습니다.");
    }
}
