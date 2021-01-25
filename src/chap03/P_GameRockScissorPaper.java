package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//결과를 비교하는 부분이 복잡했기에 그부분을 최대한 간단하게 하기 위해 dist 한단어와 숫자 비교로 처리함
//이 방식으로는 책에서 준 힌트 안쓴거기는함
import java.util.Scanner;
public class P_GameRockScissorPaper {
    public static void main(String[] args) {
        //안내
        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다/");

        //사용자 입력
        System.out.print("가위 바위 보!>>");
        String userSelect = sc.next();
        int userSelectNum=0;
        switch(userSelect){
            case "가위": userSelectNum=1;break;
            case "바위": userSelectNum=2;break;
            case "보" : userSelectNum=3;break;
            default: ;break;
        }

        //컴퓨터 입력
        int comSelectNum = (int)(Math.random()*3+1);
        String comSelect="";
        switch(comSelectNum){
            case 1: comSelect = "가위";break;
            case 2: comSelect = "바위";break;
            case 3: comSelect = "보";break;
            default: ;break;
        }
        //결과 입력
        String result = "";
        int dist=userSelectNum-comSelectNum;
        if(dist==0)
            result="비겼습니다.";
        else if(dist==-1||dist==2)
            result="졌습니다.";
        else if(dist==1||dist==-2)
            result="이겼습니다.";

        //마무리
        System.out.println("사용자 = "+userSelect+", 컴퓨터 = "+comSelect+", "+result);
        sc.close();
    }
}
