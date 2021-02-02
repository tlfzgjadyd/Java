package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//split 사용법 자를대상.split(" ");
//이렇게하면 문자열 배열을 리턴하니까 변수명으로 받아서 이후에는 배열처럼 접근하면됨
import java.util.Scanner;
public class G_Words2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String str = sc.nextLine();
            if(str.equals("그만"))
            {
                System.out.println("종료합니다...");
                sc.close();
                System.exit(0);
            }
            String[] splited=str.split(" ");
            System.out.println("어절 개수는 "+splited.length);
        }
    }
}
