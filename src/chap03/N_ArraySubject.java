package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//자바에선 문자열 비교 strcmp가 아니라 equals였던게 포인트
import java.util.Scanner;
public class N_ArraySubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score []={95, 88, 76, 62, 55};
        String input = " ";
        while(true){
            int index=-1;
            System.out.print("과목 이름>>");
            input = sc.next();
            for(int i=0;i<course.length;i++){
                if(input.equals(course[i]))
                    index=i;
            }
            if(input.equals("그만"))
                break;
            else if(index==-1)
                System.out.println("없는 과목입니다.");
            else
                System.out.println(course[index]+"의 점수는 "+score[index]);
        }
        sc.close();
    }
}
