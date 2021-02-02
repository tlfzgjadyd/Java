package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//배열길이는 그냥 배열명.length지만
//문자열 길이는 length()로 함수로 해야됨

//substring 사용해서 첫문자를 맨 뒤로 돌렸음
import java.util.Scanner;
public class H_RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸 있어도 되고 영어 한글 모두 됩니다.");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            String goBack=str.substring(0, 1);
            String newStr=str.substring(1, str.length());
            str=newStr + goBack;
            System.out.println(str);
        }
    }
}
