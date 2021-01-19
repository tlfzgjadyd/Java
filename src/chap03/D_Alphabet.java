package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//charAt 또까먹었었음 + 자료형간 변환에 자꾸 toInteger같은거 떠올리는데 그건 R같은거고
//그냥 강제캐스팅하면 되는데 까먹고있었음
import java.util.Scanner;
public class D_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String alps = sc.next();
        char alpc=alps.charAt(0);
        int alpi=(int)alpc;
        for(int i = alpc;i>=97;i--) {
            for (int j = 97; j <= i; j++)
                System.out.print((char) j);
            System.out.println();
        }
        sc.close();

    }
}
