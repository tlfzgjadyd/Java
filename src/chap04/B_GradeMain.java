package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
public class B_GradeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english=scanner.nextInt();
        B_Grade me = new B_Grade(math, science, english);
        System.out.println("평균은 "+me.average());

        scanner.close();
    }
}
