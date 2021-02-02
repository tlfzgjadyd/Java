package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//토크나이저 사용법까지는 맞았는데 몇개나왔는지는
//countTokenizer()로 한방에 하면 되는거였음

import java.util.Scanner;
import java.util.StringTokenizer;

public class G_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String str = sc.nextLine();
            if (str.equals("그만"))
            {
                System.out.println("종료합니다...");
                sc.close();
                System.exit(0);
            }
            StringTokenizer st = new StringTokenizer(str, " ");
            int count=0;
            System.out.println("어절 개수는 "+st.countTokens());
        }
    }
}
